package com.tjirm.spirale;

import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.Disposable;
import com.tjirm.spirale.Items.Card;

import java.util.Map;

public record GameResources (
        Skin spriteSkin,
        Skin uiSkin,
        Map<String, Card> cards
) implements Disposable {
    
    public void dispose() {
        spriteSkin.dispose();
        uiSkin.dispose();
    }

}
