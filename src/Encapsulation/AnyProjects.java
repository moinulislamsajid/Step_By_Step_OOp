package Encapsulation;

public class AnyProjects {
	private String password_string;
	private int pass_int;
	
	
	public void password_string(String password_string,int pass_int) {
		this.password_string = password_string;
		this.pass_int = pass_int;
	}
	public String get_pass_String(){
		return password_string;
	}
	public int get_pass_integer(){
		return pass_int;
	}
	void display() {
		System.out.println("String is : "+password_string);
		System.out.println("Integer : "+pass_int);
	}
	
	
	
	

}
