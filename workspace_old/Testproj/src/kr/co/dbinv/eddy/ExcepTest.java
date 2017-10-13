package kr.co.dbinv.eddy;
import java.io.*;

public class ExcepTest {
	public static void main(String[] args) {
		int a[]= new int[2];
		try{
			
			System.out.println("Access element thre: "+ a[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception thrown: " +e);
		}finally{
			a[0]=6;
			 System.out.println("First element value: " + a[0]);
	         System.out.println("The finally statement is executed");
		}
		System.out.println("out of the block");
		
		
	}

}
