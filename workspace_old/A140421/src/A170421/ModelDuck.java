package A170421;

public class ModelDuck extends Duck {

	public ModelDuck(){
		flyBehavior = new Flynoway();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("I'm a model Duck");
		// TODO Auto-generated method stub

	}

}
