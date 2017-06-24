package DuckCodePage18;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered()); //important important here!!!!
		model.performFly(); // change a duck's behavior at runtime!!!
		//DYNAMIC!!!
	}
}
