package com.engine.rpsls.warriors;

import java.util.Arrays;
import java.util.List;

import com.api.rpsls.Warrior;

public class Rock extends Warrior{

	public Rock() {
		this.setName("Rock");
	}
	
	@Override
	public List<String> wins() {
		return Arrays.asList("Scissors");
	}

	@Override
	public List<String> loses() {
		return Arrays.asList("Paper");
	}
}
