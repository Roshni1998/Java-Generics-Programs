package com.javagenerics;
/*
 * 1. Find the maximum from the given 3 integers
 * 2. Find the maximum from the given 3 floats
 */

public class TestMaximum {
	//Comparison of integer numbers
	public static void toPrintMaxInteger(int a, int b, int c) {
		String str1 = Integer.toString(a);
		String str2 = Integer.toString(b);
		String str3 = Integer.toString(c);
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str2.compareTo(str3));
	}
	//Comparison of floating point numbers
	public static void toPrintMaxFloat(float a, float b, float c) {
		String str1 = Float.toString(a);
		String str2 = Float.toString(b);
		String str3 = Float.toString(c);
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str2.compareTo(str3));
	}
	//Comparison of Strings
	public static void toPrintMaxString(String a, String b, String c) {
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(b.compareTo(c));
	}
	
	public static void main(String[] args) {
		toPrintMaxInteger(34, 47, 34);
		toPrintMaxFloat(3*10^6, 7*10^6, 5*10^3);
		toPrintMaxString("Apple","Peach","Banana");
	}
}
