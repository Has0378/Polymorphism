package com.has.business.ExampleOfPolymorphism;

public class OverridingTester {

	public static void main(String[] args) {
		OverridingMainMethod obj1 = new OverridingMainMethod();
		OverridingMainMethod obj2 = new OverridingDerivedMethod();
		obj1.methodOfOverriding();
		obj2.methodOfOverriding();

	}

}
