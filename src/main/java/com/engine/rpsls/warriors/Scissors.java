package com.engine.rpsls.warriors;

import java.util.Arrays;
import java.util.List;

import com.api.rpsls.Warrior;

public class Scissors extends Warrior {
	
	public Scissors() {
		this.setName("Scissors");
	}

	@Override
	public List<String> wins() {
		return Arrays.asList("Paper");
	}

	@Override
	public List<String> loses() {
		return Arrays.asList("Rock");
	}

}
