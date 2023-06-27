package com.westpac;

/**
 * 
 * EntryPoint of the application
 *
 * 
 * @author : Amritpal Singh
 * @github username : amritsingh65
 * 
 *
 */
public class App {
	public static void main(String[] args) {
		RandomNumberGeneratorController controller = new RandomNumberGeneratorController();
		RandomNumberGenerator numberGenerator = controller.getNumberGenerator();
		numberGenerator.generate(1000, 1000, 9999).forEach(System.out::println);
	}
}
