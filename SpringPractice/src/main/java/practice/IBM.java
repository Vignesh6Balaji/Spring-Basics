package practice;

import org.springframework.stereotype.Component;

@Component
public class IBM implements CPU {

	@Override
	public void process() {
		System.out.println("World's best CPU");
	}

}
