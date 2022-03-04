package artifact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//will auto recognize with bean. 
@Component
//non-captialized and bean is saved as "artifact.Car"
//more generically <package.class>
public class Car implements Vehicle{
	
	//Autowired will run to the XML to pull existing object
	//or if it's an @Component, it will simply run that.
	@Autowired
	Tire tire;
	
	public void drive() {
		System.out.println("Drive!"+tire);
		
	}
}
