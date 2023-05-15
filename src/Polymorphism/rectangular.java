package Polymorphism;

public class rectangular extends Run_Over_poly{
	double length,width;
	rectangular(double length,double width){
		this.length = length;
		this.width = width;
	}
	@Override
	double display(){
		return  length*width;
	}

}
