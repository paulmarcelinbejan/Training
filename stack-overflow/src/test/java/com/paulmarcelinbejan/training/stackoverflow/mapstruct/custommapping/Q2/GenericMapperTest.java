//package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q2;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//@ExtendWith(SpringExtension.class)
//class GenericMapperTest {
//
//	@Autowired
//	GenericMapperV2<CarSource, CarTarget> carMapper;
//	
//	@Test
//	void test() {
//		CarSource s = new CarSource(1, "BMW");
//		CarTarget t = carMapper.toTarget(s);
//		
//		System.out.println("SOURCE: "+s);
//		System.out.println("TARGET: "+t);
//		
//		assertThat(t).usingRecursiveComparison().isEqualTo(s);
//	}
//	
//}
