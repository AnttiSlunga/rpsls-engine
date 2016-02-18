package com.engine.rpsls.warriors;

import com.api.rpsls.Warrior;

import java.util.Arrays;
import java.util.List;

public class Spock extends Warrior {

	public Spock() {
		this.setName("Spock");
	}
	
	@Override
	public List<String> wins() {
		return Arrays.asList("Rock", "Scissors");
	}

	@Override
	public List<String> loses() {
		return Arrays.asList("Lizard", "Paper");
	}
}
