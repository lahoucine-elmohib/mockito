package com.lahoucine.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class GreetingImplTest {
	
	private GreetingImpl greeting;

	@Before
	public void setup(){
		System.out.println("Setup");
		greeting = new GreetingImpl();
	}
	
	@Test
	public void greetShouldReturnAValidOutput() {
		System.out.println("greetShouldReturnAValidOutput");
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_NameIsNull(){
		System.out.println("greetShouldThrowAnException_For_NameIsNull");
		greeting.greet(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_NameIsBlank(){
		System.out.println("greetShouldThrowAnException_For_NameIsBlank");
		greeting.greet("");
	}
	
	@After
	public void cleanup(){
		System.out.println("Cleanup");
		greeting = null;
	}
	
}
