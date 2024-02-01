package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q8;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Parent {

	private String parentId;

	private int parentFieldA;

	private String parentFieldB;

	private List<Child> children;

}
