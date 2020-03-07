package beforefulltime1;

public class Test {
	public void m1(int i) {
		System.out.println("int-arg method");
	}
	public void m1(float f) {
		System.out.println("int- method");
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.m1(23);
		t.m1(32f);
		t.m1('a');//char
		t.m1(20l);//float
		//t.m1(10.5);//complile time error
		
	}
}
