package itestzeal;


import java.io.File;
import java.io.FileNotFoundException;
import java.lang.System.Logger.Level;
import java.util.Scanner;
import java.util.logging.Logger;



public class filescannertest {

	public static void main(String[] args) throws FileNotFoundException {
		
		
	File file = new java.io.File("C:\\Users\\vinod\\vin.txt");
	Scanner v = new Scanner(file);
	//System.out.println("enter from external source");
	 //s = v.nextName();
	
	 v.useDelimiter("\\Z");
	 
	    System.out.println(v.next());
	  }
	

	}




