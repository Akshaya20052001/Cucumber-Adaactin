package com_Aksh_Runner;


import org.junit.Before;
import org.junit.Test;


public class RunBefore {

	    @Before
	    public void setup() {
	  
	        System.out.println("Setup method executed before each test method");
	    }

	    @Test
	    public void testMethod1() {

	        System.out.println("Executing test method 1");
	    }

	    @Test
	    public void testMethod2() {
	        // Test method 2 logic
	        System.out.println("Executing test method 2");
	    }
	}

