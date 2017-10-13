package kr.co.dbinv.eddy;

public class Continue {
	public static void main(String[] args) {
		int a, b = 1;
		for (a = 0; a < 10; a++) {
			for (b = 0; b < 10; b++) {
				if (a + b == 10)
					continue;
				else if(a + b>10 && a+b<15)
					continue;
				System.out.println(a + "+" + b + "=" + (a + b));
			}
		}
	}
}