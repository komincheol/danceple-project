package Calcilator;

public class Min {
	String name;
	Calculator c;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calculator getC() {
		return c;
	}
	public void setC(Calculator c) {
		this.c = c;
	}
	public void doit(float x, float y){
		System.out.println(c.calculate(x, y));
		
		
	}

}
