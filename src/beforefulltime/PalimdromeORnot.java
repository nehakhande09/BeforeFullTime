package beforefulltime;

public class PalimdromeORnot {
  public static void main(String[] args) {
	int r;
	int sum=0;
    int n=121;
	int temp=n;
	
	while(n>0) {
		
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
		
	}
	if(temp==sum) {
		System.out.println("palimdrome no");
	}
		
		else {
			System.out.println("not palimdrome no");
		
	}
	
}

}
