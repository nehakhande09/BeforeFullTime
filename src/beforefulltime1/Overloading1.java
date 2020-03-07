package beforefulltime1;

public class Overloading1 {
	public void m1(Object o) {
		System.out.println("object version");
		
	} 
	public void m1(String s) {
		System.out.println("string version");
		
	} 
	public static void main(String[] args) {
		Overloading1 ov=new Overloading1();
		ov.m1("durga");
		ov.m1(null);
		ov.m1(new Object());
	}
	

}
