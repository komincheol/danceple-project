package kr.co.dbinv.eddy;

import java.util.Random;
import java.util.Scanner;

public class Upgame {
	

	public static void main(String[] args) {
		int randNum;
	    int inputNum;
	    int count = 0;
	    float avg = 0;
	    int sum = 0;
	    String up = "UP!";
	    String down = "DOWN!";
	    Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        randNum = rnd.nextInt(100) + 1;
       
        while(true) {
            count++;
            System.out.println("1~100까지의 숫자를 입력하세요.: ");
            
            inputNum = scan.nextInt();
            if(inputNum == 0) {
                System.out.println("종료합니다.\n");
                break;
            }
            else if(inputNum > 100) {
                System.out.println(inputNum + " <-- 입력하신 수 ");
                System.out.println("   " + count + "번째입니다.");
                System.out.println("1~100 만 입력해주세요.");
            }
            else if(inputNum < randNum) {
                System.out.println(inputNum +"! "+up+" "+ count + "번째입니다.");
               
                
            }
            else if(inputNum > randNum) {      
                System.out.println(inputNum+"! "+down+" " + count + "번째입니다.");
                
             
            }
            else if(inputNum == randNum) {
                System.out.println("빙고!" + count + "번 만에 맞추셨어요.");
                sum = sum + count;
                count = 0;
                randNum = rnd.nextInt(100) + 1;
                break;
            }
        }
	}
	
}
            
            
        



