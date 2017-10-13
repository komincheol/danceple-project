package kr.co.dbinv.eddy;

public class Duck {
	int size;
	
	public Duck(int newsize){
		if (newsize ==0){
			size = 27;
		} else {
			size = newsize;
		}
			

		this.size= size;
		System.out.println("Quack");
		
	}
	public void setSize(int newSize){
		size = newSize;
	}
	/*public Duck(int size) {
		super();
		this.size = size;
	}*/

	

}
