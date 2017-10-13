package kr.co.dbinv.eddy;
import java.util.*;

public class UPDown {
	int randNum;
    int inputNum;
    int count = 0;
    float avg = 0;
    int i = 0;
    int sum = 0;
    String up = "업!";
    String down = "다운!";

    private void execute() {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        randNum = rnd.nextInt(100) + 1;
        
        
        while(i<3) {
        count++;
        p("1~100까지의 숫자를 입력하세요 : ");
        
        inputNum = scan.nextInt();
        if(inputNum == 0) {
            p("종료합니다.\n");
            break;
        }
        else if(inputNum > 100) {
            p(inputNum + " <-- 입력하신 수 \n");
            p("   " + count + "번째입니다.\n");
            p("1~100 만 입력해주세요. \n");
        }
        else if(inputNum < randNum) {
            p(inputNum + " <-- 입력하신 수 \n");
            p(up);
            p("   " + count + "번째입니다.");
            p("\n\n");
        }
        else if(inputNum > randNum) {
            p(inputNum + " <-- 입력하신 수 \n");
            p(down);
            p("   " + count + "번째입니다.");
            p("\n\n");
        }
        else if(inputNum == randNum) {
            p("빙고!! 빙고!!\n" + count + "번 만에 맞추셨어요.!\n");
            i++;
            sum = sum + count;
            count = 0;
            randNum = rnd.nextInt(100) + 1;
        }
        }
        avg = (float)sum / 3;
        p("평 균 : " + avg + "번 만에 맞추시네요.\n");
    }

    private void p(Object o) {
        System.out.print(o);
    }


    public static void main(String[] args) {
        new UPDown().execute();
    }

}

