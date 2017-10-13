package test;

public class DriverClass {
public static void main(String[] args) {
	Cercle s1 =new Cercle();
	s1.rotate();
	s1.playsound();
	
	Amoeba s2 =new Amoeba();
	s2.rotate();
	s2.playsound();
	s2.sayHello();
	
	Amoeba a1;
	a1 = (Amoeba) s2;
	a1.sayHello();
	}
}
