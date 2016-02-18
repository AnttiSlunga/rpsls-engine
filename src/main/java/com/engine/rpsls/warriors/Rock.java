package com.engine.rpsls.warriors;

import com.api.rpsls.Warrior;

import java.util.Arrays;
import java.util.List;

public class Rock extends Warrior{

	public Rock() {
		this.setName("Rock");
	}
	
	@Override
	public List<String> wins() {
		return Arrays.asList("Scissors", "Lizard");
	}

	@Override
	public List<String> loses() {
		return Arrays.asList("Paper", "Spock");
	}
}
