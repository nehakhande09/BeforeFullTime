package Singleton;

public class B {
	private static B instance=new B();
	
	private B() 
	{
		
	}//COSTRUCTOR PRIVATE
		
		//public static UseOfSingleTONE() {
			//return instance;
		//}
		public void showMessage(){
			System.out.println("hello");
		}

		public static B getinstance() {
			// TODO Auto-generated method stub
			return null;
		}

		
	}

