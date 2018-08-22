package itestzeal;

import java.util.Scanner;

public class oddnstar {

	public static void main(String[] args) {
		Scanner t2=new Scanner(System.in);
		int k = t2.nextInt(); 
		System.out.println("Enter a number: ");
		t2.close();
		
		for (int j=1;j<k;j++) 
		{
			if(j%2!=0) 
			{
				System.out.print(j);
				System.out.println("\n");
				for (int i=j;i<(j*2);i++) 
				{
				System.out.print( "*");
				}
				System.out.println("\n");
			
			}
		}

	}



	}


