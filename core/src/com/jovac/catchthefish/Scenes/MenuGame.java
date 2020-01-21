package com.jovac.catchthefish.Scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.jovac.catchthefish.MainGame;

public class MenuGame implements Screen {

    MainGame game;

    private OrthographicCamera orthographicCamera;
    private Texture wallpaperMenuGame, startButton, exitButton;
    private Sprite spriteWallpaperMenuGame, spriteStartButton, spriteExitButton;
    private BitmapFont bitmapFontMainMenu;


    public MenuGame(MainGame game) {
        this.game = game;
    }

    @Override
    public void show() {

        orthographicCamera = new OrthographicCamera();
        orthographicCamera.setToOrtho(false, 480, 640);

        wallpaperMenuGame = new Texture(Gdx.files.internal("wallpaperMenuGame.png"));
        spriteWallpaperMenuGame = new Sprite(wallpaperMenuGame);
        spriteWallpaperMenuGame.setSize(640,400);
        spriteWallpaperMenuGame.setPosition(-50, -20);

        startButton = new Texture(Gdx.files.internal("StartButton.png"));
        spriteStartButton = new Sprite(startButton);
        spriteStartButton.setSize(175,175);
        spriteStartButton.setPosition(Gdx.graphics.getWidth() * 0.2f, Gdx.graphics.getHeight() * 0.5f);

        exitButton = new Texture(Gdx.files.internal("ExitButton.png"));
        spriteExitButton = new Sprite(exitButton);
        spriteExitButton.setSize(150, 150);
        spriteExitButton.setPosition(Gdx.graphics.getWidth() * 0.6f, Gdx.graphics.getHeight() * 0.2f);

        bitmapFontMainMenu = new BitmapFont(Gdx.files.internal("FontMainMenu.fnt"), Gdx.files.internal("FontMainMenu.png"), false);

        game.bitmapFont = new BitmapFont();

    }

    @Override
    public void render(float delta) {

    /*
        Poner el color de fondo
     */

    Gdx.gl.glClearColor(.05f, .05f, 0.4f, 1);
    Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);

    /*
        Ponemos la camara
     */
    orthographicCamera.update();
    game.spriteBatch.setProjectionMatrix(orthographicCamera.combined);

    /*
        Abrimos el batch para poner cosas en las scena
     */

    game.spriteBatch.begin();
    spriteWallpaperMenuGame.draw(game.spriteBatch);
    spriteStartButton.draw(game.spriteBatch);
    spriteExitButton.draw(game.spriteBatch);
    bitmapFontMainMenu.draw(game.spriteBatch,"Catch The Fish", Gdx.graphics.getWidth() * 0.1f, Gdx.graphics.getHeight() * 0.9f);
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
