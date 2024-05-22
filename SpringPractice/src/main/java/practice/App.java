package practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
		
		AI ai=factory.getBean(AI.class);
		ai.config();
	}

}
