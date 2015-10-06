package pl.altkom.io.jpr.test.animals;

import pl.altkom.io.jpr.test.animals.mechanizmy.FlyMechanizm;
import pl.altkom.io.jpr.test.animals.mechanizmy.WingFly;

public class FlayingFish extends Fish implements Flayable {

	public FlyMechanizm fm = new WingFly();

	@Override
	public void fly() {
		fm.performFly();

	}

}
