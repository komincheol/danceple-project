package kr.co.dbinv.eddy;
import java.util.Scanner;

public class AreaTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, area;
		final double PI = 3.141592;

		Scanner input = new Scanner(System.in);
		System.out.print("반지름을 입력하시오 : ");
		radius = input.nextDouble();

		area = PI * radius * radius;
		System.out.println("원의 면적 : " + area);
	}

}
