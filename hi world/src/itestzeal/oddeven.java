package itestzeal;

import java.util.Scanner;

public class oddeven {
	  public static void main(String args[])
	   {
	      int i;
	      System.out.println("Enter a no to check  odd or even ");
	      Scanner t2 = new Scanner(System.in);
	      i = t2.nextInt();
	 
	      if ( i % 2 == 0 )
	         System.out.println("even no");
	      else
	         System.out.println(" odd no");
	      System.out.println("bye");
	   }
	}
	
	
