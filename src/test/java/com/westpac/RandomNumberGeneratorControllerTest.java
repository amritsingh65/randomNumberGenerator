package com.westpac;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;
/*
 * 
 * @author : Amritpal Singh
 * @github username : amritsingh65
 * 
 * This test class tests the controller has initialized the generator
 * object or not.
 **/
public class RandomNumberGeneratorControllerTest {
	private RandomNumberGeneratorController controller;

	@Before
	public void setUp() {
		controller = new RandomNumberGeneratorController();
	}

	@Test
	public void isNumberGeneratorControllerInitialised() {
		RandomNumberGenerator numberGenerator = controller.getNumberGenerator();
		assertNotSame(null, numberGenerator);
		assertNotNull(numberGenerator);
	}

	@Test(expected = NullPointerException.class)
	public void canControllerInitialiseNumberGeneratorIfNull() {
		controller = null;
		RandomNumberGenerator numberGenerator = controller.getNumberGenerator();
		assertSame(null, numberGenerator);
		assertNull(numberGenerator);
	}
	
	@Test
	public void canNumberGeneratorInitialisedByControllerIfNumberGeneratorIsNull() {
		RandomNumberGenerator numberGenerator = controller.getNumberGenerator();
		numberGenerator = null;
		assertSame(null, numberGenerator);
		assertNull(numberGenerator);
		assertNotNull(controller);
	}

}
