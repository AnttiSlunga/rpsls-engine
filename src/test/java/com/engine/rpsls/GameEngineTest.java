package com.engine.rpsls;

import com.api.rpsls.FightResult;
import com.api.rpsls.GameEngine;
import com.engine.rpsls.warriors.*;
import junit.framework.Assert;
import org.junit.Test;

public class GameEngineTest {

	@Test
	public void paperShouldWinRock() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.WIN, engine.fight(new Paper(), new Rock()));
	}

	@Test
	public void paperShouldWinSpock() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.WIN, engine.fight(new Paper(), new Spock()));
	}
	
	@Test
	public void rockShouldWinScissors() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.WIN, engine.fight(new Rock(), new Scissors()));		
	}

	@Test
	public void rockShouldWinLizard() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.WIN, engine.fight(new Rock(), new Lizard()));
	}

	@Test
	public void lizardShouldWinSpock() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.WIN, engine.fight(new Lizard(), new Spock()));
	}

	@Test
	public void lizardShouldWinPaper() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.WIN, engine.fight(new Lizard(), new Paper()));
	}

	@Test
	public void spockShouldWinScissor() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.WIN, engine.fight(new Spock(), new Scissors()));
	}

	@Test
	public void spockShouldWinRock() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.WIN, engine.fight(new Spock(), new Rock()));
	}

	@Test
	public void scissorShouldWinPaper() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.WIN, engine.fight(new Scissors(), new Paper()));
	}

	@Test
	public void scissorShouldWinLizard() throws Exception {
		GameEngine engine = new GameEngineImpl();
		Assert.assertEquals(FightResult.WIN, engine.fight(new Scissors(), new Lizard()));
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
		Assert.assertEquals(FightResult.TIE, engine.fight(new Spock(), new Spock()));
		Assert.assertEquals(FightResult.TIE, engine.fight(new Lizard(), new Lizard()));
	}
	
}
