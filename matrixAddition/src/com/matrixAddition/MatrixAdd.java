package com.matrixAddition;
import java.util.Scanner;


public class MatrixAdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		System.out.println("Enter number of column");
		int columns = scanner.nextInt();
		int [][]matrix1 = new int[rows][columns];
		int [][]matrix2 = new int[rows][columns];
		int [][]result = new int[rows][columns];
		
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
				System.out.println("Enter element for matrix 2");
				matrix2[i][j] = scanner.nextInt();
				result[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		
		printer obj=new printer();
		obj.print(result, rows, columns);
		scanner.close();
		
	}
}
	class printer{
		void print(int result[][], int rows, int columns) {
		
		for(int i=0; i<rows;i++)
		{
			for (int j =0; j<columns;j++)
			{
				System.out.print(result[j][i]+" ");
			}
			System.out.println("\n");
			
		}
		

	}
	}

