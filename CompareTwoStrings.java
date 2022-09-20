package com.bridgelabz;

import java.util.*;

public class CompareTwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String str1 = sc.next();
		System.out.println("Enter second string: ");
		String str2 = sc.next();
		if(str1.equals(str2))
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("String are not equal");
		}
	}

}
