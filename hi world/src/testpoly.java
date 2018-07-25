
public class testpoly {

	public static void main(String[] args) {
		testpoly obj = new testpoly();
		obj.addition (2, 3);
		obj.addition (2.0f,3.0f);
		obj.addition(2, 3, 4);

	}

	int addition (int a, int b) {
		int c = a+b;
		System.out.println("in int");
		return c;
	}
     float addition (float a, float b) {
    	 System.out.println("in float");
    	 float c = a+b;
    	 return c;
     }

     int addition (int a , int b, int d) {
         int c= a+b+d;
         System.out.println("in int");
         return c;
     }
}


