package com.engine.rpsls.warriors;

import com.api.rpsls.Warrior;

import java.util.Arrays;
import java.util.List;

public class Scissors extends Warrior {
	
	public Scissors() {
		this.setName("Scissors");
	}

	@Override
	public List<String> wins() {
		return Arrays.asList("Paper", "Lizard");
	}

	@Override
	public List<String> loses() {
		return Arrays.asList("Rock", "Spock");
	}

}
