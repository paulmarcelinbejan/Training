package com.paulmarcelinbejan.batch.job.employee.step.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.paulmarcelinbejan.batch.job.employee.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class EmployeeProcessor implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee employee) {
		log.info("Processing employee: {}", employee);
		return employee;
	}

}
