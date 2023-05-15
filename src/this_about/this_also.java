package this_about;

public class this_also {
	String name;
	int id;
	String uni_name;
	// creating constructor
	this_also(String name,int id){
		this.name = name;
		this.id = id;
	}
	this_also(String name,int id,String uni_name){
		this(name,id);
		this.uni_name = uni_name;

		
	}
	// create a method to display the current value
	// void no return type
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
		System.out.println("University Name : "+uni_name);
		
	}
}
