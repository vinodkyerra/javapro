
public class varargs {
	public static void main(String[] args) {
		//System.out.println("universal");
		A obj = new A();
		obj.sum(1,2,8);
		obj.sum(1.2f,5.6f);
	}
	}
class A {
	void sum (int a , int b)
	    {
		System.out.println(a+b);
	    }
	
		void sum (int a , int b, int c)
		    {
			System.out.println(a+b+c);
	        }
		
		void sum (float a , float b)
	    {
		System.out.println(a+b);
        }
		
   }




