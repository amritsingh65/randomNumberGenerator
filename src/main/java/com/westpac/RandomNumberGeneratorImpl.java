package com.westpac;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
/*
 * <pre>
 * @author : Amritpal Singh
 * @github username : amritsingh65
 * 
 * This class has implementation of generating random 4 digit unique number.
 * </pre>
 * */
public class RandomNumberGeneratorImpl implements RandomNumberGenerator {

	
	/* 
	 * <pre>
	 * This method needs three parameters for generating the unique number. 
	 * These are:
	 * limit- set to the printing numbers limit
	 * rangeFrom- set the starting range from the numbers to be followed
	 * rangeTo- set the last value where numbers are needed to consider.
	 *  </pre>
	 * */
	public Set<Integer> generate(Integer limit, Integer rangeFrom, Integer rangeTo) {
		return new Random().ints(rangeFrom, rangeTo)
				  .distinct()
				  .limit(limit)
				  .boxed()
				  .collect(Collectors.toSet());
	}
} 