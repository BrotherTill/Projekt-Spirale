package com.tjirm.spirale.Battle;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.tjirm.spirale.GameResources;
import com.tjirm.spirale.Items.Card;

public class BattleCard extends Actor {
    private final GameResources gameResources;
    private final TextureRegion cardTexture;
    private final Card card;
    
    private int health;
    
    public BattleCard(GameResources gameResources, String card) {
        this.gameResources = gameResources;
        this.cardTexture = gameResources.spriteSkin().getRegion("card");
        this.card = gameResources.cards().get(card);
    }
    
    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(cardTexture, 30, 30);
    }
}
