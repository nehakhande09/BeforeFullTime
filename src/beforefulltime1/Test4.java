package beforefulltime1;

public class Test4 {
	public void m1(int i,float f) {
		System.out.println("genaral method");
	}
	public void m1(float f,int i) {
		System.out.println("var- method");
	}

	public static void main(String[] args) {
		Test4 t=new Test4();
		t.m1(10,10.5f);
		t.m1(10.5f,10);
		//t.m1(10,10);//comp time error

}
}