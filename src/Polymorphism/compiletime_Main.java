package Polymorphism;

public class compiletime_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compiletime_poly ob = new compiletime_poly();
		int res = ob.display(8);
		System.out.println("Answer is : "+res);

		int res1= ob.display(2,2);
		System.out.println("Answer is : "+res1);

		int res2 = ob.display(10,10,20);
		System.out.println("Answer is : "+res2);

		double  res3 = ob.display(10,25.44);
		System.out.println("Answer is : "+res3);

		double res4 =  ob.display(20.0,23.23);
		System.out.println("Answer is : "+res4);

		
	}

}
