package Polymorphism;

public class Circle extends Run_Over_poly {
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	double display() {
		return   3.1416 * radius * radius;
	}

}
