package TestExamples;

public class LoopTest2 {

	public static void main(String[] args) {
		int count =0;
		for(int i = 1; i<=5;i++) {
			if(i%2==0) {
				count++;
			}
			if(count==2) {
				break;
			}
		}
		System.out.println(count);
	}

}
