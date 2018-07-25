package petc;

public class Test {

	public static void main(String[] args) {
	
		white c1 = new white();
		rednwhite c2 = new rednwhite();
		
		printcolor(c1);
		printdiet(c2);

	}

	static  void printcolor(cow c) {
		System.out.println(c.getcolor());
		}
	
	static  void printdiet(cow c) {
		System.out.println(c.getdiet());
}
}