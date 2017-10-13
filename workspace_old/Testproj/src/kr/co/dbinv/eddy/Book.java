package kr.co.dbinv.eddy;

public class Book {
int price;
int num=0;
String title;
Book(String t, int p){
	title = t;
	price= p;
}
void print(){
	System.out.println("제목: "+title);
	System.out.println("가격: "+price);
	System.out.println("주문수량: "+num);
	System.out.println("합계금액: "+price*num);
}
}
