package kr.co.dbinv.eddy;

import java.util.Scanner;

public class GUgu {
	public static void main(String[] args) {
		System.out.println("몇단을 출력하시겠습니까?");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();		
		
		for (int i= 1; i<=9; i++ ){		
				
				System.out.println(a+"*"+i +"="+ a*i );
				
				
		
		}
	}

}
