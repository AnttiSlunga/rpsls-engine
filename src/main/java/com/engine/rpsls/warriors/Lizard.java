package com.engine.rpsls.warriors;

import com.api.rpsls.Warrior;

import java.util.Arrays;
import java.util.List;

public class Lizard extends Warrior {
	
	public Lizard() {
		this.setName("Lizard");
	}
	
	@Override
	public List<String> wins() {
		return Arrays.asList("Spock", "Paper");
	}

	@Override
	public List<String> loses() {
		return Arrays.asList("Scissors", "Rock");
	}
}
