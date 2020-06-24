package com.ofss.MyApptest;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	    	Calculator c=new Calculator();
	    	customer c1=new customer();
	        System.out.println( c.add(10,20));
	        System.out.println( c.multiply(11,9));
	        System.out.println(c1.custname());
	    }
}
