package beforefulltime;

public class UsingconstructorTriangle {

	
	int area;
	UsingconstructorTriangle(int a,int b){
		area=(a*b)/2;
		
	}
}
class xyz{
	
	public static void main(String[] args) {
		UsingconstructorTriangle a1=new UsingconstructorTriangle(3,4);
		System.out.println("area:"+a1.area);
		
				
		
	}
	
	
	
}