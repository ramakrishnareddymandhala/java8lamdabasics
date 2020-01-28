package com.rk.java8;

public class TypeReference {

	public static void main(String[] args) {
		//StringLengthLamda stringlengthLamda = s -> s.length();
		printLength(s -> s.length());
	}
	
	public static void printLength(StringLengthLamda str) {
		System.out.println("String length "+str.getLength("Hell Rk"));
	}
	
	
interface StringLengthLamda{
	int getLength(String s);
}
}
