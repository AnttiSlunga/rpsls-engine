package com.engine.rpsls;

import com.api.rpsls.FightResult;
import com.api.rpsls.GameEngine;
import com.api.rpsls.Warrior;
import org.springframework.stereotype.Component;

@Component
public class GameEngineImpl implements GameEngine {

	public FightResult fight(Warrior warrior1, Warrior warrior2) {
		return warrior1.fight(warrior2);
	}

}
