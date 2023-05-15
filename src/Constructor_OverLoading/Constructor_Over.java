package Constructor_OverLoading;

public class Constructor_Over {
	String name;
	int age;
	double x,y;
	
	Constructor_Over(){
		System.out.println("This is first parameter");
	}
	Constructor_Over(String name , int age){
		this.name = name;
		this.age = age;
		
	}
	Constructor_Over(double x,double y){
		this.x = x;
		this.y = y;
		
			
	}
	
	

	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("result : "+x+y);



	}
}
