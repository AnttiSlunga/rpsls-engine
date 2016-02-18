package com.engine.rpsls;

import com.api.rpsls.FightResult;
import com.api.rpsls.GameEngine;
import com.api.rpsls.Warrior;
import com.engine.rpsls.warriors.*;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GameEngineImpl implements GameEngine {

	public FightResult fight(Warrior warrior1, Warrior warrior2) {
		return warrior1.fight(warrior2);
	}

	public Map<String, Warrior> getWarriors() {
		Map<String, Warrior> warriors = new HashMap<String, Warrior>();
		warriors.put("lizard", new Lizard());
		warriors.put("paper", new Paper());
		warriors.put("rock", new Rock());
		warriors.put("scissors", new Scissors());
		warriors.put("spock", new Spock());
		return warriors;
	}

	public Warrior getWarriorByName(String name) {
		return getWarriors().get(name);
	}

}
