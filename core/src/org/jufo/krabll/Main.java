package org.jufo.krabll;

import com.badlogic.gdx.ApplicationAdapter;

public class Main extends ApplicationAdapter {

    final int PIXELSPERUNIT;
    final int TICKSPERSECOND;
    Selector selector;

    public Main() {
        this.PIXELSPERUNIT = 10;
        this.TICKSPERSECOND = 10;
        this.selector = new Selector();
    }
    
    @Override
    public void create() {
    }

    @Override
    public void render() { //TODO: render krablls

    }
}
