package TestExamples;

public class LoopTest4 {

	public static void main(String[] args) {
		int result = 0;
		for(int i = 1; i<=6; i++) {
			if(i%3 ==0) {
				result+=i;
				break;
			}
			result++;
		}
		System.out.println(result);
	}

}
