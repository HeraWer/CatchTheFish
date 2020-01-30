package com.jovac.catchthefish.Scenes;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureArray;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jovac.catchthefish.MainGame;

public class CatchTheFish extends ApplicationAdapter implements Screen {

    MainGame game;

    OrthographicCamera orthographicCamera;
    private Texture wallpaperGame, boat, fisher, sand;
    private Sprite spriteWallpaperGame, spriteBoat, spriteFisher, spriteSand;

    public CatchTheFish(MainGame game) {
        this.game = game;
    }

    @Override
    public void show() {

        /*
          Seteamos la camara que es el alto y ancho de la pantalla
        */
        orthographicCamera = new OrthographicCamera();
        orthographicCamera.setToOrtho(false, 480, 640);

        wallpaperGame = new Texture(Gdx.files.internal("spriteWallpaperGame.png"));
        spriteWallpaperGame = new Sprite(wallpaperGame);
        spriteWallpaperGame.setSize(480, 500);

        boat = new Texture(Gdx.files.internal("spriteBoat.png"));
        spriteBoat = new Sprite(boat);
        spriteBoat.setSize(175,175);
        spriteBoat.setPosition(Gdx.graphics.getWidth() * 0.6f, Gdx.graphics.getHeight() * 0.48f);
        spriteBoat.flip(true, false);

        fisher = new Texture(Gdx.files.internal("spriteFisher.png"));
        spriteFisher =  new Sprite(fisher);
        spriteFisher.setSize(130,130);
        spriteFisher.setPosition(Gdx.graphics.getWidth() * 0.58f, Gdx.graphics.getHeight() * 0.55f);

        /*sand = new Texture(Gdx.files.internal("spriteSand.png"));
        spriteSand = new Sprite(sand);
        spriteSand.setSize(200,200);
        spriteSand.setPosition(Gdx.graphics.getWidth() * 0.1f, Gdx.graphics.getHeight() * 0.60f);*/

    }

    @Override
    public void render(float delta) {

        /*
          Ponemos la camara
        */
        orthographicCamera.update();
        game.spriteBatch.setProjectionMatrix(orthographicCamera.combined);

         /*
           Poner el color de fondo
        */
        Gdx.gl.glClearColor(.05f, .7f, 0.9f, 1);
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);

        /*
          Abrimos el batch para poner cosas en las scena
        */

        game.spriteBatch.begin();
        //spriteSand.draw(game.spriteBatch);
        spriteWallpaperGame.draw(game.spriteBatch);
        spriteFisher.draw(game.spriteBatch);
        spriteBoat.draw(game.spriteBatch);
        game.spriteBatch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
