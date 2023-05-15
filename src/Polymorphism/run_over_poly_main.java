package Polymorphism;

public class run_over_poly_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trinagle tri = new trinagle(10,20);
		Circle ci = new Circle(20);
		rectangular ti = new rectangular(20,30);
		
		
		System.out.println("Area of Trinagle : "+tri.display());
		System.out.println("Area of Circle : "+ci.display());
		System.out.println("Area of Rectangular : "+ti.display());

	}

}
