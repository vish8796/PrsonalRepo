package myPractice;

public class Pattern2 {

	public static void main(String[] args) {
		for (int outer = 5; outer >= 1; outer--) {
			for (int inner = 1; inner <=outer ; inner++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}


//for reverse triangle outer loop decrement inner loop increment