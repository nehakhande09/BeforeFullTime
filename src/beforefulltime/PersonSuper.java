package beforefulltime;

public class PersonSuper {
	int id;
	String name;
	
	PersonSuper(int id,String name){
		this.id=id;
		this.name=name;
		
	}
}
 class Emp extends PersonSuper{
	 float salary;
	 Emp(int id,String name, float salary){
		 super(id,name);
		 this.salary=salary;
	 }
	 
	void display() {
		System.out.println(id+""+name+""+salary);
	} 
	 
	 }
	 
 