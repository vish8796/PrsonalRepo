package TestExamples;

public class LoopTest {
	public static void main (String[] args) {
		int sum = 0;
		for(int i=1;i<10;i+=2) {
			if(i%4==1) {
				sum+=i;
			}
			if(sum>6) {
				break;
			}
		}
		System.out.println(sum);		
	}
}
