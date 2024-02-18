package test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("serviceActivator.xml");

		//ApplicationContext ctx2 = new ClassPathXmlApplicationContext("applicationContext.xml");

		//ApplicationContext ctx3 = new ClassPathXmlApplicationContext("filtering.xml");

		//ApplicationContext ctx4 = new ClassPathXmlApplicationContext("routing.xml");

		//ApplicationContext ctx5 = new ClassPathXmlApplicationContext("aggregate.xml");

		/*ApplicationContext ctx6 = new ClassPathXmlApplicationContext("javaScriptService.xml");
		myGateway gtw = ctx6.getBean(myGateway.class);
		gtw.process("Hello World!");*/

		/*ApplicationContext ctx7 = new ClassPathXmlApplicationContext("webServiceCalling.xml");
		myGateway gtw2 = ctx7.getBean(myGateway.class);
		gtw2.process("start");*/

		/* ctx8 = new ClassPathXmlApplicationContext("sqlDatabase.xml");
		myGateway gtw3 = ctx8.getBean(myGateway.class);
		gtw3.process("start");*/
	}

}
 