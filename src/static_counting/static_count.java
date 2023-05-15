package static_counting;

public class static_count {
	static int count = 0;
	// create to constructor to initialization value increase the value
	static_count(){
		count++;
	}
	void student_info() {
		System.out.println("Student Number : "+count);
	}
	/*
	 * static int count = 0;
	 * class name/constructor{
	 * 	count++;
	 * }
	 * 
	 * at last counting the the main method is called last objects to find the total student number
	 * 
	 * */

}
