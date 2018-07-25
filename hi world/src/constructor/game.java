package constructor;

public class game {
    
	int id;
	String  name;
	
	
	int getId()  {
	return id;
	}
    String getName() {
    return name;	
    }
 public static void main (String[]args) {
	 
	 game g1 = new game();
	 System.out.println (g1.id);
	 System.out.println(g1.name);	 
}
}
