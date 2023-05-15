package Polymorphism;

public class trinagle extends Run_Over_poly {
	double base,height;
	// create a constructor
	trinagle(double base,double height){
		this.base = base;
		this.height = height;
		
	}
	@Override
	double display() {
		return   0.5 * base * height;
	}
		
}
