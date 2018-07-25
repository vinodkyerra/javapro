
 class Test {

	 int age=25;
     String name="vinod";
   
     
     int getAge() {
    	 return age; 	 
     }
     
     String getName() {
    	 return name;
     }
     int add(int a , int b) {
    	 return a+b;
     }
     
     
     
     
	 public static void main (String[]args) {
		 Test t1 = new Test();	 
	System.out.println(t1.getAge() + t1.getName() + t1.add(55, 79));
	//System.out.println(t1.getName());
	
		
	 }
	 
}
