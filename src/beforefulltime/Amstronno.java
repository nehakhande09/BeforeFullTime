package beforefulltime;

public class Amstronno {
public static void main(String[] args) {
	int c=0,a,temp;
	int n=153;
	temp=n;
	while(n>0) {
		a=n%10;
		c=c+(a*a*a);
		n=n/10;
	}
	if(temp==c)
		System.out.println("armstrong no");
	else
		System.out.println("not armstrong no");
	
	
}
}
