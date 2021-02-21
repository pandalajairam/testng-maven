package com.testng.maven;

@FunctionalInterface
interface cab {

	public void bookcab();

	default void bookbike() {
		System.out.println("Book the bike from default method");
	}

}

public class ola{

/*	@Override
	public void bookcab() {
		System.out.println("Book the cab");
		// TODO Auto-generated method stub
		
	}*/
	
	
	public static void main(String[] args)
	{
		cab objCab = ()->System.out.println("Book the cab from the lambda expression");
		objCab.bookbike();
		objCab.bookcab();
	}

	
}


