package beforefulltime;

public class p {
	String S="PARENT CLASS";
	class c extends p{
		String S="child CLASS";
		 
		
		void mi() {
		System.out.println(S);
		System.out.println(this.S);
		System.out.println(super.S);
		}

}
 class Test{
	 public void main(String[] args) {
		c c=new c();
		c.mi();
	}
 }
}