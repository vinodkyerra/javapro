package itestzeal;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String a,b= "";
		Scanner v = new Scanner(System.in);
		System.out.println("enter  string:");
		a= v.nextLine();
		int length = a.length();
		for(int  i = length -1 ;i>=0;i--)
			b= b+a.charAt(i);
		if(a.equals(b))
		{
		System.out.println(a+  " is a palindrome ");
		}
		else {
		System.out.println(a+ " not palindrome ");

	}

}
}
