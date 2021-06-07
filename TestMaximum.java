package com.javagenerics;
/*
 * Find the maximum from the given 3 integers
 */

public class TestMaximum {
	
	public static void toPrintMaxInteger(int a, int b, int c) {
		String str1 = Integer.toString(a);
		String str2 = Integer.toString(b);
		String str3 = Integer.toString(c);
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str2.compareTo(str3));
	}
	
	public static void main(String[] args) {
		toPrintMaxInteger(34, 47, 34);
	}
}
