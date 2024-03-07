package matrixSymmetry;
import java.util.*;

public class symmetry {
	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows and columns of the matrix:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		symmetric obj=new symmetric();
		obj.check(row,col); 
        sc.close();  
	}
}
class symmetric{
     Scanner sc=new Scanner(System.in);
     void check(int row,int col)
     {        
        int[][] matrix=new int[row][col];
        int flag=0;
        if(row!=col)
	{
	   System.out.println("Entered matrix is not square matrix, hence it is not Symmetric");
	}
	else
	{
		System.out.println("Enter the elements of the matrix:");
		for(int i=0; i<row; i++)
		{
		  for(int j=0;j<col;j++)
		  {
			matrix[i][j]=sc.nextInt();
		  }
		}
		for(int i=0; i<row; i++)
		{
		for(int j=0; j<col; j++)
			{
				if(matrix[i][j]!=matrix[j][i])
				{
		    	  flag=1;
				  break;
				}
			}
		}
		if(flag==1)
		{
		  System.out.println("Matrix is not Symmetric");
		}
		else
		{
		  System.out.println("Matrix is Symmetric");
		}
	}
    }
}
