package beforefulltime;

public class PrimenoORnot {
	public static void main(String[] args) {
		int chkno=10;
		int aaa=111;
		for(int i=2;i<chkno;i++) {
			if(chkno%2==0) {
			    aaa=222;
			    //System.out.println(111);
				break;
			}
			
		}
		
		if(aaa==111) {
			System.out.println("prime no");
		}
		else {
			System.out.println("not prime no");
		}
		
	}

}
