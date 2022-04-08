package com.sample;

public class GitClass {
public static void main(String[] args) {
	

	int a = 26, b = 34;

	if (a > b && b == 34) {
		System.out.println("Full ticket");
	} else if (a == 26 || b < a) {
		System.out.println("Half ticket");
	} else {
		System.out.println("Having no ticket");
	}

}
}
