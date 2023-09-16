//package com.paulmarcelinbejan.batch.x;
//
//import org.springframework.stereotype.Component;
//
//import com.paulmarcelinbejan.batch.job.employee.Employee;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@Component
//@RequiredArgsConstructor
//public class EmployeeServiceImpl implements EmployeeService {
//
//	private final EmployeeRepository employeeRepository;
//	
//	@Override
//	public void save(Employee employee) {
//		Employee saved = employeeRepository.save(employee);
//		log.info("Saved employee: {}", employee);
//	}
//
//}
