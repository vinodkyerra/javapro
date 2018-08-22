package itestzeal;

import java.util.Scanner;

public class SumofNnum {

	public static void main(String[] args) {
		Scanner v = new Scanner (System.in);
		System.out.println("enter no");
		int n = v.nextInt();
		
		int sum = 0;
		for (int  i=0; i<=n;i++){
		sum = sum + i;
	}
	System.out.println("sum of given no:"+sum);
		
	}
}
