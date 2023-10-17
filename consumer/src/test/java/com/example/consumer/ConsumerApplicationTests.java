package com.example.consumer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerApplicationTests {

	@Test
	void calc1(){
		Assertions.assertEquals(4, new Calc().sum(2,2));
	}


}
