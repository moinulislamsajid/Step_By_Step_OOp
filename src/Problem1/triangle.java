package Problem1;

public class triangle extends Call_the_method {
	triangle(double dim1,double dim2) {
		super(dim1,dim2);
	}
	@Override
	void display() {
		double result = 0.5 * dim1 * dim2;
		System.out.println("Triangule : "+result);
	}

}
