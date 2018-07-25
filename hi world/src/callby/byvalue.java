package callby;

public class byvalue {
	
	public static void main (String[]args) {
	
	int x=6;
	int y=8;
	
	int addition = add(x, y);
	System.out.println("x:"+ x + "y:"+ y +  "result:"+ addition );
	
	
	}
	static int add (int a , int b) {
		System.out.println("a:"+ a + "b:" + b);
		int result = a+b;
		a++;
		b++;
		System.out.println("a:"+ a + "b:" + b);
		return result;
	}
	 

}
