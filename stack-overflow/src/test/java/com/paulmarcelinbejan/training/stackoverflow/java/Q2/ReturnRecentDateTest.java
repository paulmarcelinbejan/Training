package com.paulmarcelinbejan.training.stackoverflow.java.Q2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.paulmarcelinbejan.training.stackoverflow.java.Q2.Car;

class ReturnRecentDateTest {

	Comparator<Car> bySold = Comparator.comparing(Car::getSold);
	
	@Test
	void returnTheMostRecentDateAfterComparingDatesFromArrayListInJava() {
		List<Car> carsList = new ArrayList<>();
	   
		carsList.add(new Car("BMW", "2023-01-01T02:00:00.800Z"));
	    carsList.add(new Car("Jeep", "2023-01-02T02:00:00.800Z"));
	    carsList.add(new Car("Benz", "2023-01-03T02:00:00.800Z"));

	    String sold = carsList.stream().sorted(bySold).max(bySold).get().getSold();

	    assertEquals("2023-01-03T02:00:00.800Z", sold);
	}
	
}
