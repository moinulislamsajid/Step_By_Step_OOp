package Polymorphism;

public class another_poly_inherit_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly_another_runtime ob = new Poly_another_runtime();
		ob.display();
		/*ob = new Another_poly_inherit();
		ob.display();
		ob = new Another_poly_inherit2();
		ob.display();*/
		// base class reference variable deya child class ar objects
		
		// this is runtime or dynamic polymorphism 
		Poly_another_runtime ob1 = new Another_poly_inherit();
		ob1.display();
		
		Poly_another_runtime ob2 = new Another_poly_inherit2();
		ob2.display();
		
		
	}

}
