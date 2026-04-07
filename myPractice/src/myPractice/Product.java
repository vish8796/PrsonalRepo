package myPractice;

public class Product {
	
	int a ,b;
	
	static void m1 (int a, int b) {
		int Output = a * b ;
		System.out.println("Expected output :" + a + "X" + b + "=" + Output);
	 }

	public static void main(String[] args) {
		Product.m1(25,5);

	}

}
