package petc;

public class Test2 {

	public static void main(String[] args) {
	  
		Animal c1 = new white();
		Animal c2 = new RedFox();
		
		printdiet(c1);
		printdiet(c2);

	}

	
	
	static  void printdiet(Animal c) {
		System.out.println(c.getdiet());

	}

}
