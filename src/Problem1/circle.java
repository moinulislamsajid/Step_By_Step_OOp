package Problem1;

public class circle extends Call_the_method {
	circle(double r){
		super(r,r);
	}
	@Override
	void display() {
		double result = 3.1416 * dim1 * dim1;
		System.out.println("Circle : "+result);
	}
}
