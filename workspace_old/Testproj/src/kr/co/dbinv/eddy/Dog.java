package kr.co.dbinv.eddy;

public class Dog {
	private int size= 10;
	private String bread;
	private String name;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if (size > 0) {
			this.size = size;
		} else {
			System.out.println("사이즈는 0보다 커야합니다.");
		}

	}

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void bark() {
		System.out.println("Ruff");
	}
}
