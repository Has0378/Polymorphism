package com.has.business.ExampleOfPolymorphism;

public class Overloading {

	
	
	public void test (int a){
		
		System.out.println ( "A:" + a);
	}
	
	public void test ( int a, int b){
		
		System.out.println ("A and B : " + a + "," + b);
	}
	
	public double test (double a){
		System.out.println("Double a: " + a);
		return a*a;
	}		
		
				
	public static void main(String[] args) {
		
		Overloading Obj = new Overloading();
		double result;
		Obj .test(10);
		Obj .test(10, 20);
		result = Obj .test(5.5);
		System.out.println("O/P :" + result);
		
		
		

	}
	
	

}
