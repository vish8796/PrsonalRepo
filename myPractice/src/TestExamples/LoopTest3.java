package TestExamples;

public class LoopTest3 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0;i<5;i++) {
			sum+=i;
			if(i==2) {
				break;
			}
		}
		System.out.println(sum);
	}

}
