package kr.co.dbinv.eddy;

public class MovieTestDrive {
	
	public static void main(String[] args) {
		Movie s1 = new Movie();
		s1.setTitle("Gone with the Stock"); //= Gone with the Stock;
		s1.setGenre("Tragic"); //= Tragic;
		s1.setRating(-2);//= -2;
		System.out.println(s1.getRating());
		
		Movie s2 = new Movie();
		s2.setTitle("Lost in Cubicle Space");
		//System.out.println(s2.getTitle());
		s2.setGenre("Comedy");
		
		s2.setRating(5); 
		
		s2.playIt();
		
		Movie s3 = new Movie();
		s3.setTitle("Byte Club"); //= Byte Club;
		s3.setGenre("Tragic but ultimately uplifting");//= Tragic but ultimately uplifting;
		s3.setRating(127); //= 127;
		System.out.println(s3.getRating());
		
	}
}
