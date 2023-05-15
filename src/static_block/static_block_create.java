package static_block;

public class static_block_create {
	static String name;
	static int id;
	// Create a Static block for variable initialization 
	static {
		
		name = "Ayman Sajid";
		id = 101;
		
	}
	static void display() {
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
	}
	

}
