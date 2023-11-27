package interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestB {

	@Test
	void test1() {
		
		List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
		
		System.out.println(numbers);
		
		numbers.remove(1);
		
		System.out.println(numbers);
		
	}
	
	@Test
	void test2() {
		
		Collection<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
		
		System.out.println(numbers);
		
		numbers.remove(1);
		
		System.out.println(numbers);
		
	}
	
}
