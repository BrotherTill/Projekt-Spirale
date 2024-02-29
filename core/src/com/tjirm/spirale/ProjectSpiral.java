package com.tjirm.spirale;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.ScreenUtils;
import com.tjirm.spirale.Battle.BattleCard;
import com.tjirm.spirale.Items.Card;

import java.util.HashMap;


public class ProjectSpiral extends ApplicationAdapter {
	SpriteBatch batch;
	private GameResources gameResources;
	
	private BattleCard cardActor;
	
	@Override
	public void create () {
		Json json = new Json();
		batch = new SpriteBatch();
		gameResources = new GameResources(
				new Skin(Gdx.files.internal("packed/sprite.json")),
				new Skin(Gdx.files.internal("packed/UI.json")),
				json.fromJson(HashMap.class, Card.class, Gdx.files.internal("resources/cards.yaml"))
		);
		cardActor = new BattleCard(gameResources, "example");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(gameResources.uiSkin().getRegion("badlogic"), 0, 0);
		cardActor.draw(batch, 1);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		gameResources.dispose();
	}
}
