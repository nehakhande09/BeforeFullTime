package beforefulltime;

public class Swaptwono {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before swap:"+a +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		//System.out.println("after swap:"+a +b);
		//cout<<"after swapping:x="<<x<<",y="<<y;
		System.out.println("after swap:"+ "a="+a+",b="+b);
	}

}
