package com.jovac.catchthefish;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jovac.catchthefish.Scenes.MenuGame;

public class MainGame extends Game {

    /*
        Para representar texturas
     */
    public SpriteBatch spriteBatch;

    /*
        Para representar textos en pantalla
     */
    public BitmapFont bitmapFont;


    @Override
    public void create() {
        spriteBatch = new SpriteBatch();
        bitmapFont = new BitmapFont();
        this.setScreen(new MenuGame(this));
    }

    @Override
    public void render() {
        super.render();
    }
}
