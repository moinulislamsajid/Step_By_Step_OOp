package Static_Variable;



public class static_Variable {
	 String name;
	 int age;
	 static String uni_name = "DIU";
	static_Variable(String name, int age){
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("University Name : "+uni_name);
	}

}
