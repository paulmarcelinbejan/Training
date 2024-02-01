package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

/**
 * https://stackoverflow.com/questions/77866503/mapping-a-flattened-parent-child-list
 */
class MappingAFlattenedParentChildListTest {

	@Test
	void run() {

		Flattened flat1 = new Flattened();
		flat1.setParentId("1");
		flat1.setParentFieldA(1);
		flat1.setParentFieldB("1_ParentFieldB");
		flat1.setChildId("1");
		flat1.setChildFieldA(1);
		flat1.setChildFieldB("1_ChildFieldB");

		Flattened flat2 = new Flattened();
		flat2.setParentId("1");
		flat2.setParentFieldA(1);
		flat2.setParentFieldB("1_ParentFieldB");
		flat2.setChildId("2");
		flat2.setChildFieldA(2);
		flat2.setChildFieldB("2_ChildFieldB");

		Flattened flat3 = new Flattened();
		flat3.setParentId("1");
		flat3.setParentFieldA(1);
		flat3.setParentFieldB("1_ParentFieldB");
		flat3.setChildId("3");
		flat3.setChildFieldA(3);
		flat3.setChildFieldB("3_ChildFieldB");

		Flattened flat4 = new Flattened();
		flat4.setParentId("2");
		flat4.setParentFieldA(2);
		flat4.setParentFieldB("2_ParentFieldB");
		flat4.setChildId("4");
		flat4.setChildFieldA(4);
		flat4.setChildFieldB("4_ChildFieldB");

		Flattened flat5 = new Flattened();
		flat5.setParentId("2");
		flat5.setParentFieldA(2);
		flat5.setParentFieldB("2_ParentFieldB");
		flat5.setChildId("5");
		flat5.setChildFieldA(5);
		flat5.setChildFieldB("5_ChildFieldB");

		List<Flattened> flattenedList = List.of(flat1, flat2, flat3, flat4, flat5);
		List<Parent> parentList = MyMapper.INSTANCE.map(flattenedList);

		System.out.println(parentList);

		int childernOfParent1 = parentList.stream()
				.filter(p -> StringUtils.equals(p.getParentId(), "1"))
				.findFirst()
				.get()
				.getChildren()
				.size();
		
		int childernOfParent2 = parentList.stream()
				.filter(p -> StringUtils.equals(p.getParentId(), "2"))
				.findFirst()
				.get()
				.getChildren()
				.size();
		
		assertEquals(2, parentList.size());
		assertEquals(3, childernOfParent1);
		assertEquals(2, childernOfParent2);

	}
	
}
