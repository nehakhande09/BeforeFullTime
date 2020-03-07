package beforefulltime;

public class XX extends Z {
	int a=40;
	  
	void M1() {
		int a=50;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		Y yy=new  Y();
		System.out.println(yy.a); 
		X xx=new X();
		System.out.println(xx.a); 
		
	}
	public static void main(String[] args) {
		XX t=new XX();
		t.M1();
	}
}
