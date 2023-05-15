package Inheritance;

public class inherit_private_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inherit_private1 info = new inherit_private1();
		info.set_Name("Ayman Sajid");
		info.set_Age(20);
		info.set_Village("Goalpara");
		
		info.info_print();
		
		inherit_private1 info1 = new inherit_private1();
		info1.set_Name("Mojibur Rahman");
		info1.set_Age(15);
		info1.set_Village("Goalpara");
		
		info1.info_print();
		
	}

}
