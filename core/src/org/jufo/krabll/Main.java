package org.jufo.krabll;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Main extends ApplicationAdapter {
	final int PIXELSPERUNIT = 10;
        final int TICKSPERSECOND = 1;
        Selector selector;
	
	@Override
	public void create () {
            selector = new Selector();
        }

	@Override
	public void render () { //TODO: render krablls
        
	}
}
