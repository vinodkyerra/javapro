package exception;

public class test1 {
 int divide(int a , int b) {
	 int c =0;
	 try {
	  c = a/b;
	 }catch (Exception e ) {
		 System.out.println("in divide catch");
			 	 
	 }
	 return c;
 }
 public static void main(String[] args) {
	 test1 obj = new test1();
	 int result = obj .divide(8,0);
	 System.out.println("result:"+ result);
	
}
}
