package com.jovac.catchthefish.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jovac.catchthefish.MainGame;
import com.jovac.catchthefish.Scenes.CatchTheFish;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title =  " CatchTheFish " ;
		config.width=  480 ;
		config.height =  640 ;
		new LwjglApplication(new MainGame(), config);
	}
}
