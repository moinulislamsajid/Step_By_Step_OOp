package Inheritance;

public class inherit_private1 extends inherit_private{
	private String Village;
	public void set_Village(String Village) {
		this.Village = Village;
	}
	public String get_Village() {
		return Village;
	}
	void info_print()
	{
		display();
		System.out.println("His Village is : "+Village);
		System.out.println("\n");
	}
}
