package super_constructor;

public class super_constructor_inherit extends super_constructor{
	// create constructor
	String uni_name;
	super_constructor_inherit(String name,int id, String uni_name){
		super(name,id);
		this.uni_name = uni_name;
	}
	@Override
	void display() {
		super.display();
		System.out.println("UniverSity Name : "+uni_name);
	}
}
