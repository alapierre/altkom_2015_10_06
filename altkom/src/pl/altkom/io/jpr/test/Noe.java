package pl.altkom.io.jpr.test;

import pl.altkom.io.jpr.test.animals.Flayable;

public class Noe {

	
	//....
	
	public void putAllFlayableToArc(Flayable[] fl){
		
		for (int i = 0; i < fl.length; i++) {
			fl[i].fly();			
		}
		
		
		
	}
}
