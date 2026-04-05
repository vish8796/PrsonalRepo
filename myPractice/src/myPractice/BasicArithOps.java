package myPractice;

public class BasicArithOps {
	
	void add(int a , int b) {
		int output = a + b ;
		System.out.println("Sum =" + output );
	}
	
	void sub(int a , int b) {
		int output = a - b ;
		System.out.println("Diff =" + output );
	}
	
	void mul(int a , int b) {
		int output = a * b ;
		System.out.println("Product =" + output );
	}
	
	void div(int a , int b) {
		int output = a / b ;
		System.out.println("Answer =" + output );
	}
	
	void mod(int a , int b) {
		int output = a % b ;
		System.out.println("Remainder =" + output );
	}
	
	void ops(int a , int b) {
		BasicArithOps all = new BasicArithOps();
		all.add(a, b);
		all.sub(a, b);
		all.mul(a, b);
		all.div(a, b);
		all.mod(a, b);
		
	}

	public static void main(String[] args) {
		BasicArithOps op = new BasicArithOps();
		op.ops(125, 24);
	}

}
