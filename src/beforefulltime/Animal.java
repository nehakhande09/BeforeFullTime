package beforefulltime;

public class Animal {
	void eat() {
		System.out.println("eating");
	}
	
	class Birds extends Animal{
		 void eat() {
			System.out.println("eating xyz");
			
		}
		void bark() {
			System.out.println("barkking");
			
		}
		void sleeping() {
			System.out.println("sleeping");
			
		}
		
		 void avbbb() {
			super.eat();
			bark();
		}
		
	}
}


