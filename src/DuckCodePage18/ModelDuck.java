package DuckCodePage18;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay(); //same with the mallard duck here
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a model duck");
	}

}
