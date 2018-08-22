package itestzeal;

import java.util.Scanner;

public class distancebwtwowords {

	public static void main(String[] args) {
		String s = "blue";
	    String[] arr = s.split(" ");
	    int startIndex = -1;
	    int endIndex = -1;
	    for(int i=0; i<arr.length; i++){
	        if(arr[i].equals("color")){
	            startIndex = i;
	        }
	        else if(arr[i].equals("blue")){
	            endIndex = i;
	        }
	    }
	    System.out.println("distance is: " + (endIndex-startIndex));
	}

}
