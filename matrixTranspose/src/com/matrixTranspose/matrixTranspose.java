package com.matrixTranspose;

import java.util.Scanner;

public class matrixTranspose {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		System.out.println("Enter number of column");
		int columns = scanner.nextInt();
		int [][]matrix1 = new int[rows][columns];
		int [][]transpose = new int[rows][columns];;
		//get elements
		
		for(int i=0; i<rows;i++)
		{
			for (int j =0; j<columns;j++)
			{
				System.out.println("Enter element for matrix 1");
				matrix1[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<rows;i++)
		{
			for (int j =0; j<columns;j++)
			{
				
				transpose[i][j] = matrix1[j][i];
			}
		}
		
		for(int i=0; i<rows;i++)
		{
			for (int j =0; j<columns;j++)
			{
				if (transpose[i][j] != matrix1[i][j])
				{
					System.out.println("Not symmatric");
				}
			}
			
		}
		System.out.println("Matrix is symmatric");
		scanner.close();

	}


	}

