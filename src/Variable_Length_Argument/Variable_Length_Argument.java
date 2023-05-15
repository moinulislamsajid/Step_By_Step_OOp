package Variable_Length_Argument;

public class Variable_Length_Argument {
	void add(int ... num) {
		int sum = 0;
		for(int x : num) {
			sum = sum + x;
		}
		System.out.println(sum);
	}

}
