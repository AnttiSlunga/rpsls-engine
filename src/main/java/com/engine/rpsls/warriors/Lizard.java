package com.engine.rpsls.warriors;

import java.util.Arrays;
import java.util.List;

import com.api.rpsls.Warrior;

public class Lizard extends Warrior {
	
	public Lizard() {
		this.setName("Lizard");
	}
	
	@Override
	public List<String> wins() {
		return Arrays.asList("Rock");
	}

	@Override
	public List<String> loses() {
		return Arrays.asList("Scissors");
	}
}
