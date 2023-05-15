package static_metod;

public class static_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static_Open hey = new static_Open();
		hey.display();
		// here call the static method 
		static_Open.display1(); // this static method connected to class can not connected to objects
	}

}
