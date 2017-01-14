package com.trs.gradle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	 private HelloWorldService helloWorld;
	 
	    @Before
	    public void setUp() {
	    	helloWorld = new HelloWorldService();
	    }
	    
	@Test
	public void testHello() {
		assertEquals("Hello World!", helloWorld.hello());
	}

}
