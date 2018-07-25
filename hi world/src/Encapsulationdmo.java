
public class Encapsulationdmo {
	
	private int id;
	private String Name;
	private int age;

	
	
	public int getId()
	{
		return id;
	}
	public String getName() 
	{
	return Name;
	}
	
	public int getage() 
	{
		return age;
	}
	
	
	
	public void setId(int newValue) {
		id= newValue;
	}
	
	public void setage(int newValue) {
		age= newValue;
	}
	public void setName(String newValue) {
		Name= newValue;
	
	}
	
	
	public static void main(String args[]) {
		
		 Encapsulationdmo obj = new Encapsulationdmo();
         obj.setName("david");
         obj.setage(26);
         obj.setId(1596514);
         System.out.println(" Name: " + obj.getName());
         System.out.println(" id: " + obj.getId());
         System.out.println(" age: " + obj.getage());
    } 
		
	}












