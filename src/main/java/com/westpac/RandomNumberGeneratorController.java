package com.westpac;
/*
 * <pre>
 * @author : Amritpal Singh
 * @github username : amritsingh65
 * </pre>
 * 
 * This controller class works as a decorator of the interface 
 *  and creating the object based on the request.
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
