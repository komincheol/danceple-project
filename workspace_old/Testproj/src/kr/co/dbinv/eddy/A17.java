package kr.co.dbinv.eddy;

import java.util.ArrayList;
import java.util.Scanner;

public class A17 {
	
	public static void main(String[] args) {
		int p = 64;
		int x;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		while(x!=0){
			if(p>x){
				p/=2;
			}else{
				x -= p;
				count++;
			}
		}
		System.out.println(count);
	}
	
}