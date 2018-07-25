package inherit;
public class Override 
{
	public static void main (String[] args)
	{
	
      B obj = new B ();
      obj.game();
	}
	
}


class A 
{
		public void game () 
		{
		System.out.println("game is over in A");
		}
	
}
class B extends A 
{
    	public void game() 
    	{
    	System.out.println("game is also over in B");
    	}
 }

