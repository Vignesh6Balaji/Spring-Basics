package practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AI {
	
	@Autowired
	@Qualifier("IBM")
	private CPU cpu;
	
	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Jarvis AI Assistant, NLP, ML, DL, RL, LLM");
		cpu.process();
	}
}
