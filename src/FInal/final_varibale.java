package FInal;

public class final_varibale {
	final String name = "Ayman Sajid";
	final int age; // blank final variable 
	// when final variable initialization then you create a constructor
	final_varibale(){
		age = 20;
	}
	void display() {
		//name = "hey"; --> can not access because final value declared it can not modifier
		//age = 20; --> it also same
		
		System.out.println("His name : "+name);
		System.out.println("His age is : "+age);
		
	}

}
