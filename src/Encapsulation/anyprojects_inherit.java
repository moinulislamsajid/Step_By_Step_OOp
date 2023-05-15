package Encapsulation;

public class anyprojects_inherit extends AnyProjects {
	
	private char special_pass;
	public void set_special_pass(char special_pass){
		this.special_pass = special_pass;
	}
	public char get_special_pass() {
		return special_pass;
		
	}
	void inherit_information() {
		super.display();
		System.out.println("Special symbol : "+special_pass);
	}
	
	
}
