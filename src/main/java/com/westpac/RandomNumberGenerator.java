package com.westpac;

import java.util.Set;

/*
 * 
 * @author : Amritpal Singh
 * @github username : amritsingh6
 *
 * This interface generates random unique numbers.
 * **/
public interface RandomNumberGenerator {
	Integer size = 1000;
	Integer randomNumberMin = 1000;
	Integer randomNumberMax = 9999;
	
	/*
	 * <pre>
	 *  This method will generate 1000 random unique numbers are of 4 digit Pins.
	 *  This interface can be used with multiple classes where unique pins are required.
	 *  </pre>
	 *  
	 * */
	Set<Integer> generate(Integer limit, Integer numberRangeFrom, Integer numberRangerTo);
}
