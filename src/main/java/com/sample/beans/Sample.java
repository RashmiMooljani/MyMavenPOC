package com.sample.beans;

import org.apache.log4j.Logger;

public class Sample {

	/*public boolean isGreater(int num1, int num2){
		return num1 > num2;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World...");
	}*/
	
	 private static Logger LOGGER = Logger.getLogger(Sample.class);
	 
	    public static void main( String[] args )
	    {
	        LOGGER.info("Hello World!");
	    }
}
