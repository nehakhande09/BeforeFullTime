package beforefulltime1;

public class Test2 {
	public void m1(String s) {
		System.out.println("string version");
	}
	public void m1(StringBuffer sb) {
		System.out.println("stringbuffer version");
	}
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.m1("durga");
		t.m1(new StringBuffer("durga"));
		//t.m1(null);
		
	}

}
