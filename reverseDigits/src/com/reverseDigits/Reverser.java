package com.reverseDigits;
import java.util.Scanner;

public class Reverser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num ;
		int reverse = 0;
		int digit;
		System.out.println("Enter the number of your choice:- ");
		num = scanner.nextInt();
		
		while(num>10) {
			digit = num%10;
			reverse += digit;
			reverse *=10;
			num = num/10;
			
		}
		digit = num%10;
		reverse += digit;
		System.out.println(reverse);
		scanner.close();

	}

}
