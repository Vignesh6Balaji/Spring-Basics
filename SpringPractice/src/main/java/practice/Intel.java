package practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Intel implements CPU {

	@Override
	public void process() {
		System.out.println("2nd Best Processor");
	}

}
