package pl.altkom.io.jpr.test.animals;

import pl.altkom.io.jpr.test.animals.mechanizmy.FlyMechanizm;
import pl.altkom.io.jpr.test.animals.mechanizmy.WingFly;

public class Bat extends Mammal implements Flayable {

	public FlyMechanizm fm;
	
	
	
	@Override
	public void fly() {
		fm.performFly();
		
	}

}
