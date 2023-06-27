package com.westpac;
/*
 * <pre>
 * @author : Amritpal Singh
 * @github username : amritsingh65
 * </pre>
 * 
 * This controller class works as a handler of the library 
 *  and creating the object for generating the random numbers.
 **/
public class RandomNumberGeneratorController {
	private RandomNumberGenerator generator = null;
	
	RandomNumberGeneratorController() {
		this.generator = new RandomNumberGeneratorImpl();
	}
	
	public RandomNumberGenerator getNumberGenerator() {
		return generator;
	}

}
