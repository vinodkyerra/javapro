
 package itestzeal;

import java.util.Scanner;

public class Sumofnum {
 public static void main(String[] args) {
  Scanner v = new Scanner(System.in);
  
  System.out.println("enter 1st no: ");
  int firstNumber = v.nextInt();
  
  System.out.println("enter 2nd no: ");
  int secondNumber = v.nextInt();
  
  int sum = firstNumber + secondNumber;
  System.out.println("the addition result:" +sum);
  
   }
}
