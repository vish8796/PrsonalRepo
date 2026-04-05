package myPractice;

public class Table {

	void table(int x) {
		for (int a = 1; a <= 10; a++) {
			int ans = x * a;
			System.out.println(x + "X" + a + "=" + ans);
		}
	}

	public static void main(String[] args) {
		Table tab = new Table();
		tab.table(8);

	}

}
