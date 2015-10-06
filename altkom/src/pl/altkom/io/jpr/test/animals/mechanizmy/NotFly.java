package pl.altkom.io.jpr.test.animals.mechanizmy;

public class NotFly  implements FlyMechanizm{

	@Override
	public void performFly() {
		System.out.println("nie latam");
		
	}

}
