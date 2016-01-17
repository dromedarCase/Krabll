package org.jufo.krabll;

import com.badlogic.gdx.ApplicationAdapter;

public class Main extends ApplicationAdapter {
    // PIXELSPERUNIT and TICKSPERSECOND for rendering as well as a selector for
    // selecting
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
    
    // TODO: render krablls
    @Override
    public void render() {

    }
}
