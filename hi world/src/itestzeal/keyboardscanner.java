package itestzeal;

import java.util.Scanner;

public class keyboardscanner {

	public static void main(String[] args) {
		
     keyboardscanner v = new  keyboardscanner();
     v.runScanner();
	}
private void runScanner() {
    int no;
    double  age;
    String name;
    
    Scanner in = new Scanner(System.in);
    
    
    System.out.println("enter a no ");
    no = in.nextInt();
    
    System.out.println("enter a no1:");
    age = in.nextDouble(); 
    
    System.out.println("enter a name:");
    name = in.next();
    
    System.out.println("enter a no is 12:"+"enter age is 26:"+"enter name vin:");
    
}
}
