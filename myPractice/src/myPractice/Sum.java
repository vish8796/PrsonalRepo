package myPractice;

// Using reference variable to call the method and then perform the action

public class Sum {

	void sum(int A, int B) {
		int sum = A + B;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Sum fun = new Sum();
		fun.sum(74, 36);
	
	
	}
}
