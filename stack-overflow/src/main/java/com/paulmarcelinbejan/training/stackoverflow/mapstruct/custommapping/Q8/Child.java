package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Child {

	private String childId;

	private int childFieldA;

	private String childFieldB;

}
