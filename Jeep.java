package artifact;

import org.springframework.stereotype.Component;

@Component
public class Jeep extends Car {
	
	public void drive() {
		System.out.println("Off Roading!");
	}
}
