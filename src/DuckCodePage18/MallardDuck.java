package DuckCodePage18;

public class MallardDuck extends Duck {
 	public MallardDuck() {
 		quackBehavior = new Quack(); //here here here important!!!
		flyBehavior = new FlyWithWings(); //here here here important!!!
	}
 	 
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real Mallard duck");
	}
}
