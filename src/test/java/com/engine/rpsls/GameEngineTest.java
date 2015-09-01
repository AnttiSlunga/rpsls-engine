package com.engine.rpsls;

import junit.framework.Assert;

import org.junit.Test;

import com.api.rpsls.FightResult;
import com.api.rpsls.GameEngine;
import com.engine.rpsls.warriors.Paper;
import com.engine.rpsls.warriors.Rock;
import com.engine.rpsls.warriors.Scissors;

public class GameEngineTest {

	@Test
	public void paperShouldWinRock() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.WIN, engine.fight(new Paper(), new Rock()));
	}
	
	@Test
	public void rockShouldWinScissors() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.WIN, engine.fight(new Rock(), new Scissors()));		
	}
	
	@Test 
	public void scissorShouldLoseToRock() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.LOSE, engine.fight(new Scissors(), new Rock()));			
	}
	
	@Test
	public void tieShouldBePossible() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.TIE, engine.fight(new Scissors(), new Scissors()));	
		Assert.assertEquals(FightResult.TIE, engine.fight(new Rock(), new Rock()));	
		Assert.assertEquals(FightResult.TIE, engine.fight(new Paper(), new Paper()));	
	}
	
}
