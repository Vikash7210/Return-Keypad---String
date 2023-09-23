package com.java.problem;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = Solution.keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
		s.close();
	}

}
