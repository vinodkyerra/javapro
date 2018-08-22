package collections;

import java.util.ArrayList;
import java.util.HashMap;

class person {
	private String name;
	private String skill;
	person (String name, String skill){
		this.name = name;
		this.skill = skill;
	}
	public void showData () {
		System.out.println("Name:"+this.name+" , Skill:"+this.skill);
	}
}



public class Hashmapdmo {
	public static void main(String[] args) {
		
	
	person dev1 = new person("a","java");
	person dev2 = new person("b","java");
	person dev3 = new person("c","java");
	person dev4 = new person("d","java");
	
	ArrayList<person> devList = new ArrayList<person>();
	
	devList.add(dev1);
	devList.add(dev2);
	devList.add(dev3);
	devList.add(dev4);
	
	HashMap<String,ArrayList<person>> javaTeam = new HashMap<String,ArrayList<person>>();
	
	javaTeam.put("Mohamad", devList);
	
	
	ArrayList<person> personList = javaTeam.get("Mohamad");
	for(person p : personList){
		p.showData();
	}
                     

	}

}
