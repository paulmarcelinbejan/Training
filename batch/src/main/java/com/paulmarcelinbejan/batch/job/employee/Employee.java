package com.paulmarcelinbejan.batch.job.employee;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
@Document(collection = "employees")
public class Employee {

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private int id;
	
	@Field
	@Column(name = "firstName", nullable = false)
	@JsonProperty(value = "firstName")
	private String firstName;
	
	@Field
	@Column(name = "lastName", nullable = false)
	@JsonProperty(value = "lastName")
	private String lastName;
	
}
