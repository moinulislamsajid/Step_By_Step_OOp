package Problem1;

public class rectangular extends Call_the_method {
	
	rectangular(double dim1,double dim2) {
		super(dim1,dim2);
	}
	@Override
	void display() {
		double result = dim1 * dim2;
		System.out.println("Rectangular : "+result);
	}
}
