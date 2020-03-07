package static1;

public class Staticptest {
	public static void main(String[] args) {
		
	
	Staticp aa1=new Staticp();
	aa1.a++;
	//aa1.b++;
	A.b++;//class name calling
	System.out.println("a:"+aa1.a);
	System.out.println("b:"+aa1.b);
	
	Staticp aa2=new Staticp();
	aa2.a++;
	aa2.b++;
	System.out.println("a:"+aa2.a);
	System.out.println("b:"+aa2.b);
	
	Staticp aa3=new Staticp();
	aa3.a++;
	aa3.b++;
	System.out.println("a:"+aa3.a);
	System.out.println("b:"+aa3.b);
	
	
	
	
}
}