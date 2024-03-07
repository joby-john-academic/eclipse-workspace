package complexAdd;
import java.util.*;

public class complex {

	public static void main(String[] args) {
		int a1,b1,a2,b2,a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Real part of first complex number:");
        a1=s.nextInt();
        System.out.println("Enter the imaginary part of first complex number:");
        b1=s.nextInt();
        System.out.println("c1="+a1+"+"+b1+"i");
        System.out.println("Enter the Real part of second complex number:");
        a2=s.nextInt();
        System.out.println("Enter the imaginary part of second complex number:");
        b2=s.nextInt();
        System.out.println("c2="+a2+"+"+b2+"i");
        a=a1+a2;
        b=b1+b2;
        if(b>0)
        {
        	System.out.println("The sum of two numbers are:");
        	System.out.println("c="+a+"+"+b+"i");
        }
        else
        {
        	System.out.println("The sum of two numbers are:");
        	System.out.println("c="+a+b+"i");
        }
        s.close();

    }
	
	}

