package com.noOfdigits;
import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				int num ;
				int digit=0;
				System.out.println("Enter the number of your choice:- ");
				num = scanner.nextInt();
				
				while(num>0) {
					digit +=1;
					num = num/10;
					
				}
				System.out.println(digit);
				scanner.close();



}
}
