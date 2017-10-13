package A170421;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck(){
		
	}

		public abstract void display();
		public  void performFly(){
			flyBehavior.fly();
		}
		public void performQuack(){
			quackBehavior.quack();
		}
		public FlyBehavior getFlyBehavior() {
			return flyBehavior;
		}


		public QuackBehavior getQuackBehavior() {
			return quackBehavior;
		}


		public void swim(){
			System.out.println("All Duack float,even decoys!");
		}
		public void setFlyBehavior(FlyBehavior fb){
			flyBehavior = fb;
		}
		public void setQuackBehavior(QuackBehavior qb){
			quackBehavior= qb;
		}
	}

