package com.jovac.catchthefish.Scenes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.jovac.catchthefish.MainGame;

import java.awt.Menu;

public class MenuGame implements Screen {

    MainGame game;

    private OrthographicCamera orthographicCamera;
    private Texture wallpaperMenuGame, startButton, exitButton, posterMainMenu, pezMainMenu1, pezMainMenu2, pezMainMenu3;
    private Sprite spriteWallpaperMenuGame, spriteStartButton, spriteExitButton, spritePosterMainMenu,
                   spritePezMainMenu1, spritePezMainMenu2, spritePezMainMenu3;
    private BitmapFont bitmapFontMainMenu;
    int aux1 = Gdx.graphics.getWidth(), aux2 = 0, aux3 = 200;
    boolean pezFueraLimites1,pezFueraLimites2,pezFueraLimites3 = false;


    public MenuGame(MainGame game) {
        this.game = game;
    }

    @Override
    public void show() {

        /*
            Seteamos la camara que es el alto y ancho de la pantalla
         */
        orthographicCamera = new OrthographicCamera();
        orthographicCamera.setToOrtho(false, 480, 640);

        /*
            Ponemos el sprite wallpaper de fondo con dimensiones i posicion
         */
        wallpaperMenuGame = new Texture(Gdx.files.internal("wallpaperMenuGame.png"));
        spriteWallpaperMenuGame = new Sprite(wallpaperMenuGame);
        spriteWallpaperMenuGame.setSize(640,400);
        spriteWallpaperMenuGame.setPosition(Gdx.graphics.getWidth() * -0.20f, Gdx.graphics.getHeight() * -0.05f);

        startButton = new Texture(Gdx.files.internal("StartButton.png"));
        spriteStartButton = new Sprite(startButton);
        spriteStartButton.setSize(175,175);
        spriteStartButton.setPosition(Gdx.graphics.getWidth() * 0.2f, Gdx.graphics.getHeight() * 0.4f);

        exitButton = new Texture(Gdx.files.internal("ExitButton.png"));
        spriteExitButton = new Sprite(exitButton);
        spriteExitButton.setSize(150, 150);
        spriteExitButton.setPosition(Gdx.graphics.getWidth() * 0.6f, Gdx.graphics.getHeight() * 0.2f);

        posterMainMenu = new Texture(Gdx.files.internal("CartelMainMenu.png"));
        spritePosterMainMenu = new Sprite(posterMainMenu);
        spritePosterMainMenu.setSize(450,150);
        spritePosterMainMenu.setPosition(Gdx.graphics.getWidth() * 0.02f, Gdx.graphics.getHeight() * 0.75f);

        bitmapFontMainMenu = new BitmapFont(Gdx.files.internal("FontMainMenu.fnt"), Gdx.files.internal("FontMainMenu.png"), false);

        pezMainMenu1 = new Texture(Gdx.files.internal("pezMainMenu1.png"));
        spritePezMainMenu1 = new Sprite(pezMainMenu1);
        spritePezMainMenu1.setSize(100, 100);
        pezMainMenu2 = new Texture(Gdx.files.internal("pezMainMenu2.png"));
        spritePezMainMenu2 = new Sprite(pezMainMenu2);
        spritePezMainMenu2.setSize(50, 50);
        pezMainMenu3 = new Texture(Gdx.files.internal("pezMainMenu3.png"));
        spritePezMainMenu3 = new Sprite(pezMainMenu3);
        spritePezMainMenu3.setSize(70, 70);



    }

    @Override
    public void render(float delta) {

        /*
            Moviemiento spritePezMainMenu1
         */
        if (pezFueraLimites1 == false) {
            spritePezMainMenu1.setPosition(aux1 -= 50 * Gdx.graphics.getDeltaTime(), Gdx.graphics.getHeight() * 0.5f);
        } else {
            spritePezMainMenu1.setPosition(aux1 += 100 * Gdx.graphics.getDeltaTime() , Gdx.graphics.getHeight() * 0.5f);
        }

        /*
            Movimiento spritePezMainMenu2
         */
        if (pezFueraLimites2 == false) {
            spritePezMainMenu2.setPosition(aux2 -= 50 * Gdx.graphics.getDeltaTime(), Gdx.graphics.getHeight() * 0.9f);
        } else {
            spritePezMainMenu2.setPosition(aux2 += 100 * Gdx.graphics.getDeltaTime() , Gdx.graphics.getHeight() * 0.9f);
        }

        /*
            Movimiento spritePezMainMenu3
         */
        if (pezFueraLimites3 == false) {
            spritePezMainMenu3.setPosition(aux3 -= 50 * Gdx.graphics.getDeltaTime(), Gdx.graphics.getHeight() * 0.2f);
        } else {
            spritePezMainMenu3.setPosition(aux3 += 100 * Gdx.graphics.getDeltaTime() , Gdx.graphics.getHeight() * 0.2f);
        }

        /*
            Giro sprite 1
         */
        if (spritePezMainMenu1.getX() >= Gdx.graphics.getWidth()) {
            spritePezMainMenu1.flip(true, false);
            pezFueraLimites1 = false;
        }

        if (spritePezMainMenu1.getX() <= 0) {
            aux1 = 10;
            spritePezMainMenu1.flip(true, false);
            pezFueraLimites1 = true;
        }

        /*
            Giro sprite 2
         */
        if (spritePezMainMenu2.getX() >= Gdx.graphics.getWidth()) {
            spritePezMainMenu2.flip(true, false);
            pezFueraLimites2 = false;
        }

        if (spritePezMainMenu2.getX() <= 0) {
            aux2 = 10;
            spritePezMainMenu2.flip(true, false);
            pezFueraLimites2 = true;
        }

        /*
            Giro sprite 3
         */
        if (spritePezMainMenu3.getX() >= Gdx.graphics.getWidth()) {
            spritePezMainMenu3.flip(true, false);
            pezFueraLimites3 = false;
        }

        if (spritePezMainMenu3.getX() <= 0) {
            aux3 = 10;
            spritePezMainMenu3.flip(true, false);
            pezFueraLimites3 = true;
        }
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
    spritePezMainMenu1.draw(game.spriteBatch);
    spritePezMainMenu2.draw(game.spriteBatch);
    spriteStartButton.draw(game.spriteBatch);
    spriteExitButton.draw(game.spriteBatch);
    spritePezMainMenu3.draw(game.spriteBatch);
    spritePosterMainMenu.draw(game.spriteBatch);
    bitmapFontMainMenu.draw(game.spriteBatch,"To fish !", Gdx.graphics.getWidth() * 0.3f, Gdx.graphics.getHeight() * 0.9f);
    game.spriteBatch.end();


        if (Gdx.input.isTouched()) {
            Vector3 tmp=new Vector3(Gdx.input.getX(),Gdx.input.getY(), 0);
            orthographicCamera.unproject(tmp);
            Rectangle textureStartButton= new Rectangle(spriteStartButton.getX(),spriteStartButton.getY(),spriteStartButton.getWidth(),spriteStartButton.getHeight());
            Rectangle textureExitButton= new Rectangle(spriteExitButton.getX(),spriteExitButton.getY(),spriteExitButton.getWidth(),spriteExitButton.getHeight());
            if(textureStartButton.contains(tmp.x,tmp.y)) {
                game.setScreen(new CatchTheFish(game));
            }
            if(textureExitButton.contains(tmp.x,tmp.y)) {
                dispose();
            }
        }

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
        game.spriteBatch.end();
    }
}
