package org.jufo.krabll.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import org.jufo.krabll.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = Main.getTITLE();
                config.height = Main.getHEIGTHINUNITS() * Main.getPIXELSPERUNIT();
                config.width = Main.getWIDTHINUNITS() * Main.getPIXELSPERUNIT();
                new LwjglApplication(new Main(), config);
	}
}
