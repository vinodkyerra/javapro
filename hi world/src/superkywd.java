	
	class parent  {
		int a=25;
		void test() {
			System.out.println(" test()");
		}
	}

	class child extends parent {
		int b;
		int a=20;
		void disp() {
			System.out.println(" disp()"+super.a);
			
		}
	}
	public class superkywd {
		public static void main(String[] args) {
			child obj = new child();
			System.out.println(obj.a);
			obj.disp();
		}
		
	}
		

