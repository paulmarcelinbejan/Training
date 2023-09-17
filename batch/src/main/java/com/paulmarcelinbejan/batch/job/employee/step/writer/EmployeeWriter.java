//package com.paulmarcelinbejan.batch.job.employee.step.writer;
//
//import org.springframework.batch.item.Chunk;
//import org.springframework.batch.item.ItemWriter;
//import org.springframework.stereotype.Component;
//
//import com.paulmarcelinbejan.batch.job.employee.Employee;
//
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@Component
//public class EmployeeWriter implements ItemWriter<Employee> {
//	
//	@Override
//	public void write(Chunk<? extends Employee> chunk) throws Exception {
//		for ( Employee employee : chunk ) {
//			log.info("Writing employee : " + employee );
//		}
//	}
//	
//}
