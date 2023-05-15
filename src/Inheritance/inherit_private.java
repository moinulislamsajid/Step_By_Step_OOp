package Inheritance;

public class inherit_private {
	private String name;
	private int age;
	
	public void set_Name(String name) {
		this.name = name;
	}
	public String get_Name() {
		return name;
	}
	public void set_Age(int age) {
		this.age = age;
	}
	public int get_Age() {
		return age;
	}
	void display() {
		System.out.println("His Name is : "+name);
		System.out.println("His Age : "+age);
	}

}
