package myPractice;

public class StaticVsInstance {
	int x= 1;
	static int y = 2;
	
	void instanceMethod() {
		x++;
		y++;
		System.out.println("Instance:x = " + x + ",y= " + y);
		staticMethod();
	}
	
	static void staticMethod() {
		StaticVsInstance obj = new StaticVsInstance();
		obj.x=10;
		y+=5;
		System.out.println("Static:x + " + obj.x + ",y = "+ y);
	}

	public static void main(String[] args) {
		StaticVsInstance obj = new StaticVsInstance();
		obj.instanceMethod();
		obj.instanceMethod();

	}

}
