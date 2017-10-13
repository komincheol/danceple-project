package kr.co.dbinv.eddy;

public class DogTestDrive {
	public static void main(String[] args) {

		Dog d1 = new Dog();

		d1.setSize(50);
		System.out.println(d1.getSize());
		d1.bark();
	}
}
