package itestzeal;

public class MainmethodOverloading {

	public static void main(String[] args) {
		System.out.println("main method");
		MainmethodOverloading.main("method");
	}
	public static void main (String arg1) {
		System.out.println("main,"+arg1);
		MainmethodOverloading.main("hi method","method");
	}
	public static void main (String arg1, String arg2) {
		System.out.println("main,"+ arg1+","+arg2);
	}

} 

	
	

