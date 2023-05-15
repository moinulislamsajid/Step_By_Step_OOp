package Polymorphism;

public class compiletime_poly {

	// declaring method
	int display(int x) {
		return x;
	}
	int display(int x,int y) {
		return x+y;
	}
	int display(int x,int y,int z) {
		return x+y+z;
	}
	double display(int x,double z) {
		return x+z;
	}
	double display(double x,double y) {
		return x+y;
	}
	
	
	
}
