package itestzeal;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
		a.add("22");
		a.add("32");
		a.add("62");
		a.add("52");
		a.add("12");
		Collections.sort(a);//(a,Collections.reverseOrder());
		System.out.println("Collections.sort():"+a);
		

	}

}
