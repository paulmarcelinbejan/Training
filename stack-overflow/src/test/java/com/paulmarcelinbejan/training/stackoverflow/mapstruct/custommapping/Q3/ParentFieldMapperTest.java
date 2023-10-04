package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q3.Child;
import com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q3.ChildDTO;
import com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q3.ChildMapper;

/**
 * https://stackoverflow.com/questions/77230604/how-to-set-mapping-in-mapstruct-to-get-the-parents-field-in-childs-dto
 */
class ParentFieldMapperTest {

	@Test
	void run() {
		Child child = new Child();
		child.setParentField("X");
		
		ChildDTO response = ChildMapper.INSTANCE.toDTO(child);
		assertNotNull(response);
		assertEquals("X", response.getParentField());
	}
	
}
