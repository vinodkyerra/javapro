package callby;

public class byreference {

	public static void main(String[] args) {
		StringBuilder name = new StringBuilder ("sehw");
		System.out.println(name);
		System.out.println(name.hashCode());
		printName(name);
		System.out.println(name);
		
		
	}
	static void printName(StringBuilder sr) {
		System.out.println(sr.hashCode());
		sr.append("well off");
	}

}
