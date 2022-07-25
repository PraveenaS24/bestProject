package com.chainsys.bestPractices.sam;

import java.util.ArrayList;

// SAM - Single Abstract Method
interface IntegerFunction {
	Integer doOperations(int x, int y); // Abstract method
}

interface StringFunction {
	String execute(String s);
}

interface NumberFunction {
	Integer doOperations(int x, int y, int z); // Abstract method
}

class ImplementerA implements IntegerFunction {

	@Override
	public Integer doOperations(int x, int y) {
		return x + y;
	}

}

public interface SamLessons {
	public static void demoA() {
		IntegerFunction total = new ImplementerA();
		IntegerFunction add = (x, y) -> x + y; // Lambda Expression
//		(x,y) this is parameters for the function
//		-> x+y this is the implementation for the method
//		add is an implementation of doOperation method of interface IntegerFunction
//		here total is an object reference to class ImplementerA but add refers to anonymous object
		NumberFunction sum = (x, y, z) -> x + y + z;
		IntegerFunction multiply = (x, y) -> x * y;
		IntegerFunction divide = (x, y) -> x / y;
		Integer result = add.doOperations(3, 6);
//		using wrapper class to treat it as Object(Boxing)
		System.out.println("result :" + result);
		result = multiply.doOperations(3, 12);
		result = total.doOperations(12, 12);
		System.out.println("result :" + result);
		System.out.println("result :" + result);
		result = divide.doOperations(12, 8);
		System.out.println("result :" + result);
		System.out.println(add.getClass().getName());
	}

	public static void demoB() {
		StringFunction upper = (s) -> s.toUpperCase();
		StringFunction lower = (s) -> s.toLowerCase();
		String result = upper.execute("subramani");
		System.out.println("result :" + result);
		result = lower.execute("SUBRAMANI");
		System.out.println("result :" + result);
	}

	public static void demoC() {
		IntegerFunction getTotal = (x, y) -> x + y;
		ArrayList<Integer> nos = new ArrayList<Integer>();
		nos.add(100);
		nos.add(20);
		nos.add(30);
		nos.add(25);
		nos.add(80);
//		nos.forEach((n)-> System.out.println(n));
		int i = 100;
		nos.forEach((n) -> {
			int result = 0;
			result = getTotal.doOperations(n, i);
			System.out.println(" total: " + result);
		});
//		multi line statements
	}
}
