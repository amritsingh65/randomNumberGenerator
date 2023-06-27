package com.westpac;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Random number generator App.
 * 
 * 
 * @author : Amritpal Singh
 * @github username : amritsingh65
 *
 */
public class AppTest {
	private App app;

	@Before
	public void setUp() {
		app = new App();
	}

	@Test
	public void canAppInitialized() {
		assertNotNull(app);
		
	}
	

}
