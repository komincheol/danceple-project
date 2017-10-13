package Dog;

import java.util.Random;

public class GoodDogTestDrive {
	public static void main (String[] args) {
		int randnum;
		int random;
		Random rnd = new Random();
		randnum = rnd.nextInt(100) + 1;
		random = rnd.nextInt(100);
			Gooddog one = new Gooddog();
			one.setSize(randnum);
			Gooddog two = new Gooddog();
			two.setSize(random);
			System .out.println ("Dog one: "+ one.getSize());
			System.out.println("Dog two: "+two.getSize());
			one.bark();
			two.bark();
 }
}
