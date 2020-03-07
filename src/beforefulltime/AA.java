package beforefulltime;

public class AA {
	AA(){
		System.out.println("iam in const");
	}
	AA(int y){
		// AA aa=new AA();
		this();//first line
	}
	
	public static void main(String[] args) {
		//this();--- only constructor error cause of first line
		 AA aa=new AA(20);
	}
	}


