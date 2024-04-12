package com.paulmarcelinbejan.training.personal.Q1;

import org.junit.jupiter.api.Test;

class RetrieveNameOfClassTest {

	@Test
	void test1() {
		Mazda m3 = new Mazda();
		m3.printNameOfSubclass();
	}

	@Test
	void test2() {
		Mazda m3 = new Mazda();
		m3.printNameOfParentClass();
	}

}
