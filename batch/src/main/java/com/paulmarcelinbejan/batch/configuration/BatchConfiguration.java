package com.paulmarcelinbejan.batch.configuration;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import com.paulmarcelinbejan.batch.job.employee.Employee;
import com.paulmarcelinbejan.batch.job.employee.step.processor.EmployeeProcessor;
import com.paulmarcelinbejan.batch.job.employee.step.reader.EmployeeReader;
import com.paulmarcelinbejan.batch.job.employee.step.writer.EmployeeWriter;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableBatchProcessing
@RequiredArgsConstructor
public class BatchConfiguration {
	
	private final EmployeeReader employeeReader;
	
	private final EmployeeProcessor employeeProcessor;
	
	private final EmployeeWriter employeeWriter;
	
//	private final MongoItemWriter<Employee> employeeWriter;
	
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
	public Step step1(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
		return new StepBuilder("step1", jobRepository)
				.<Employee, Employee>chunk(10, transactionManager)
				.reader(employeeReader)
				.processor(employeeProcessor)
				.writer(employeeWriter)
				.build();
	}

//	@Bean
//	public EmployeeReader employeeReaderStep() {
//		return new EmployeeReader();
//	}
//
//	@Bean
//	public EmployeeProcessor employeeProcessorStep() {
//		return new EmployeeProcessor();
//	}
//
//	@Bean
//	public MongoItemWriter<Employee> employeeWriterStep(MongoTemplate mongoTemplate) {
//		return new MongoItemWriterBuilder<Employee>()
//				.collection("employees")
//				.template(mongoTemplate)
//				.build();
//	}
//	
//	@Bean
//	public JdbcBatchItemWriter<Employee> writerStep1(DataSource dataSource) {
//		return new JdbcBatchItemWriterBuilder<Employee>()
//				.itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
//				.sql("INSERT INTO employees (firstname, lastname) VALUES (:firstName, :lastName)")
//				.dataSource(dataSource).build();
//	}
	
}