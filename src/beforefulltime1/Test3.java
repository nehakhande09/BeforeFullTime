package beforefulltime1;

public class Test3 {
	
		public void m1(int i) {
			System.out.println("genaral method");
		}
		public void m1(int...i) {
			System.out.println("var- method");
		}

		public static void main(String[] args) {
			Test3 t=new Test3();
			t.m1();
			t.m1(110,20);
			t.m1(10);//genral method as old version dominates in java
			
			
	}
	}


