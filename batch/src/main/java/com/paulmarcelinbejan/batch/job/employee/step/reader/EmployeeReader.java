package com.paulmarcelinbejan.batch.job.employee.step.reader;

import java.io.IOException;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.MappingIterator;
import com.paulmarcelinbejan.batch.job.employee.Employee;
import com.paulmarcelinbejan.toolbox.constants.enums.DirectoryPath;
import com.paulmarcelinbejan.toolbox.utils.io.common.FileInfo;
import com.paulmarcelinbejan.toolbox.utils.io.csv.CsvUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class EmployeeReader implements ItemReader<Employee> {

	public EmployeeReader() {
		CsvUtils<Employee> csvEmployee = new CsvUtils<>(Employee.class);
		try {
			iterator = csvEmployee.iterator(new FileInfo(DirectoryPath.SRC_MAIN_RESOURCES.value, "employees"));
		} catch (IOException e) {
			throw new RuntimeException("IOException while reading employees file!", e);
		}
	}
	
	private MappingIterator<Employee> iterator;
	
//	private List<Employee> employees = List.of(new Employee("A", "a"), new Employee("B", "b"), new Employee("C", "c"), new Employee("D", "d"), new Employee("E", "e"), new Employee("F", "f"));
//	
//	private int index = 0;
	
	@Override
	public Employee read() {
		
//		if (index < employees.size()) {
//			Employee employee = employees.get(index);
//			log.info("Reading item: {}", employee);
//			index++;
//			return employee;
//		} else {
//			return null;
//		}
		
		if (iterator.hasNext()) {
			
			Employee employee = iterator.next();

			log.info("Reading item: {}", employee);
			
			return employee;
			
		} else {
			
			return null;
			
		}
		
	}
	
	public void closeIterator() {
		try {
			iterator.close();
		} catch (IOException e) {
			log.warn("IOException while trying to close the iterator!");
			e.printStackTrace();
		}
	}

}
