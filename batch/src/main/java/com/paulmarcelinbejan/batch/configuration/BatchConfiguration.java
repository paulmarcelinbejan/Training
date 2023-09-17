package com.paulmarcelinbejan.batch.configuration;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.HibernateItemWriter;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.database.builder.JpaItemWriterBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.paulmarcelinbejan.batch.job.employee.Employee;
import com.paulmarcelinbejan.batch.job.employee.step.processor.EmployeeProcessor;
import com.paulmarcelinbejan.batch.job.employee.step.reader.EmployeeReader;

import jakarta.persistence.EntityManagerFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class BatchConfiguration {
	
	private final EmployeeReader employeeReader;
	
	private final EmployeeProcessor employeeProcessor;
	
//	private final EmployeeWriter employeeWriter;
	
//	private final MongoItemWriter<Employee> employeeWriter;
	
//	private final JdbcBatchItemWriter<Employee> employeeWriter;
	
	@Bean
	public Job employeeJob(JobRepository jobRepository, JobExecutionListener listener, Step step1) {
		return new JobBuilder("employeeJob", jobRepository)
				.incrementer(new RunIdIncrementer())
				.listener(listener)
				.flow(step1)
				.end()
				.build();
	}

	@Bean
	public Step step1(JobRepository jobRepository, PlatformTransactionManager transactionManager, EntityManagerFactory entityManagerFactory) {
		return new StepBuilder("step1", jobRepository)
				.<Employee, Employee>chunk(10, transactionManager)
				.reader(employeeReader)
				.processor(employeeProcessor)
				.writer(employeeWriter(entityManagerFactory))
//				.writer(employeeWriter(dataSource))
				.build();
	}
	
	@Bean
	public PlatformTransactionManager transactionManager() {
	    return new JpaTransactionManager();
	}

	@Bean
	public JpaItemWriter<Employee> employeeWriter(EntityManagerFactory entityManagerFactory) {
		return new JpaItemWriterBuilder<Employee>()
				.entityManagerFactory(entityManagerFactory)
				.build();
	}
	
//	@Bean
//	public MongoItemWriter<Employee> employeeWriterStep(MongoTemplate mongoTemplate) {
//		return new MongoItemWriterBuilder<Employee>()
//				.collection("employees")
//				.template(mongoTemplate)
//				.build();
//	}

//	@Bean
//	public JdbcBatchItemWriter<Employee> employeeWriter(DataSource dataSource) {
//		return new JdbcBatchItemWriterBuilder<Employee>()
//				.itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
//				.sql("INSERT INTO employees (first_name, last_name) VALUES (:firstName, :lastName)")
//				.dataSource(dataSource).build();
//	}
	
}