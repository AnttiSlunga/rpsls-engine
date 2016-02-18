package com.engine.rpsls.warriors;

import com.api.rpsls.Warrior;

import java.util.Arrays;
import java.util.List;

public class Paper extends Warrior {

	public Paper() {
		this.setName("Paper");
	}
	
	@Override
	public List<String> wins() {
		return Arrays.asList("Rock", "Spock");
	}

	@Override
	public List<String> loses() {
		return Arrays.asList("Scissors", "Lizard");
	}

}
