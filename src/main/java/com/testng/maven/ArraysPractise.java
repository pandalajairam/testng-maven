package com.testng.maven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysPractise {
	
	public ArraysPractise()
	{
		callFromConstructor();
		//super();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] list = {1,2,3,4,5};
		Integer[] intArray = new Integer[] {
		        new Integer(15),
		        new Integer(9),
		        new Integer(16),
		        new Integer(2),
		        new Integer(30)
		    };
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(19);
		numbers.add(18);
		numbers.add(14);
		numbers.add(13);
		System.out.println("Before sort "+numbers.toString());
		//Arrays.sort(intArray,Collections.reverseOrder());
		Collections.sort(numbers);
		System.out.println("After sort "+numbers);
		Collections.reverse(numbers);
		System.out.println("Reverse order "+numbers);
		System.out.println(numbers.get(1));
		ArraysPractise ap = new ArraysPractise();
		try
		{
			System.out.println("Try block");
			int a =1/0;
		}
		catch(Exception ex)
		{
		System.out.println("catch block");	
		}
		finally
		{
			System.out.println("Finally block");
		}
	}
	
	public void callFromConstructor()
	{
		System.out.println("Call from the constructor");
		
	}

}
