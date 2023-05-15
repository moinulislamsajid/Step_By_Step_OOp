package HashMapAndHashshap;

import java.util.HashMap;

public class has_Map {
	public static void main(String[] args) {
		// hash map
		
		// create Hash map
		HashMap<Integer,String> student = new HashMap<Integer,String>();
		student.put(101, "Ayman Sajid"); // here 101 is key and Ayman Sajid is a value
		student.put(102, "Samiur Rahman");
		student.put(103, "Moujibur Rahman");
		student.put(104, "Rebeka Sultana");
		
		
		System.out.println(student.get(101));
		System.out.println(student.get(103));
		System.out.println(student.get(104));


		
		
	}

}
