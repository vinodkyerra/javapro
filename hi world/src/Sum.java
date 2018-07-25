
public class Sum {
	
	int i= 10;
	int j= 11;
	
	int addition()
	{
	return i + j;
	}

	public static void main(String[] args) {
		Sum s1 = new Sum();
		int result  = s1.addition (30,20);
		System.out.println ("result is :"+ result);
	}
	
	int addition (int g, int h) {
	return (g+h);
	
	
	}
	
}