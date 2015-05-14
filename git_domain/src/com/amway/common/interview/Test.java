package com.amway.common.interview;

public class Test {
	public static void main(String[] ards) throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Caught in main()");
		}
		System.out.println("nothing");
	}
}
