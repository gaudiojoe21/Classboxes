package artifact;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		
		Vehicle c = (Vehicle) context.getBean("car");
		c.drive();
//
//		c = (Vehicle) context.getBean("jeep");
//		c.drive();
//		
//		Tire t = (Tire) context.getBean("tire");
//		System.out.println(t);
	}

}
