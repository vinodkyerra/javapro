
public class varargs1 {

	public static void main(String... args) {
		B obj = new  B();
		obj.sum(1,3,5,7,9);
	}
	}
class B{
		void sum(int ... a) {
			int sum = 0;
			
			for (int i = 0; i < a.length;i++)
				sum = sum +a[i];
				System.out.println("sum of varargs:" + sum);
		}
	}

