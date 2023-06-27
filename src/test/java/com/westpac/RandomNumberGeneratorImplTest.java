package com.westpac;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/*
 * 
 *  @author : Amritpal Singh
 * @github username : amritsingh65
 * 
 * This test class tests the actual logic of generating 4 digit
 * unique random numbers.
 * 
 **/
public class RandomNumberGeneratorImplTest {
	private RandomNumberGenerator randomNumberGenerator;

	@Before
	public void setUp() {
		randomNumberGenerator = new RandomNumberGeneratorImpl();
	}

	@Test
	public void isNumberGeneratorInitialised() {
		assertNotSame(null, randomNumberGenerator);
		assertNotNull(randomNumberGenerator);
	}

	@Test
	public void isRandomNumberGeneratorReturnsEmptyNumbers() {
		Set<Integer> generatedRandomNumbers = randomNumberGenerator.generate(1000, 1000, 9999);
		assertFalse(generatedRandomNumbers.isEmpty());
	}

	@Test(expected = NullPointerException.class)
	public void canRandomNumberThrowExceptionForNullValue() {
		randomNumberGenerator.generate(1000, 0, null);
	}

	@Test
	public void canNumberGeneratorGeneratesThousandRandomNumber() {
		Set<Integer> generatedRandomNumbers = randomNumberGenerator.generate(1000, 1000, 9999);
		assertEquals(1000, generatedRandomNumbers.size());
		assertFalse(generatedRandomNumbers.size() < 1000);
		assertFalse(generatedRandomNumbers.size() > 1000);
	}

	@Test
	public void canRandomNumberOfFourDigitsGenerated() {
		Set<Integer> generatedRandomNumbers = randomNumberGenerator.generate(1000, 1000, 9999);
		generatedRandomNumbers.forEach(generatedNumber -> {
			assertTrue(generatedNumber.toString().length() == 4);
		});
		assertFalse(generatedRandomNumbers.size() > 1000);
	}

	@Test
	public void canRandomNumberGeneratesNumbersOnly() {
		Set<Integer> generatedRandomNumbers = randomNumberGenerator.generate(1000, 1000, 9999);
		generatedRandomNumbers.forEach(generatedNumber -> {
			assertTrue(generatedNumber.toString().matches(".*[0-9].*"));
		});
	}

}
