package pl.altkom.io.jpr.test.animals;

import pl.altkom.io.jpr.test.animals.mechanizmy.FlyMechanizm;
import pl.altkom.io.jpr.test.animals.mechanizmy.WingFly;

public class Eagle  extends Bird implements Flayable {
	public FlyMechanizm fm = new WingFly();
	
	
	
	@Override
	public void fly() {
		fm.performFly();
		
	}
	
}
