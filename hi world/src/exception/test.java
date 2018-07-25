package exception;

public class test {

	int divide(int a , int b) {
		int c = a/b;
		return c;
	}
	public static void main(String[] args) {
		test obj = new test();
		int result = 0;
		try {
		 result = obj.divide(8,0);
		}catch (Exception ex) {
			System.out.println("in excep"+ ex.getMessage());
			
		}
		System.out.println("result:"+ result);
		System.out.println("done");
	}
  }
