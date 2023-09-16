package com.paulmarcelinbejan.batch.job.employee.listener;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

import com.paulmarcelinbejan.batch.job.employee.step.reader.EmployeeReader;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class EmployeeJobListener implements JobExecutionListener {
	
	private final EmployeeReader employeeReader;
	
	@Override
	public void beforeJob(JobExecution jobExecution) {
		log.info("############## JOB STARTING ############## ");
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("############## JOB COMPLETED ############## ");
			employeeReader.closeIterator();
		}
	}

}
