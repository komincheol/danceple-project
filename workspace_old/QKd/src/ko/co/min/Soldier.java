package ko.co.min;

public class Soldier {
	int height;
	int weight;
	Weapon w;
	Move m;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
	}
	
	public Move getm() {
		return m;
	}

	public void setm(Move m) {
		this.m = m;
	}
	
	public void attack(){
		w.useWeapon();
	}
	public void movement(){
		m.movement();
	}
	
	

	
}
