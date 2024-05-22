package practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "practice")
public class AppConfig {

	/*
	 * @Bean public AI getAI() { return new AI(); }
	 * 
	 * @Bean public CPU getcpu() { return new IBM(); }
	 */
}
