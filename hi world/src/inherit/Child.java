package inherit;

public class Child extends Parent {

	public static void main (String[]args) {
		Child c = new Child();
		System.out.println(c.eyecolor);
		System.out.println(c.legs);
		System.out.println(c.height);
	}
	
}