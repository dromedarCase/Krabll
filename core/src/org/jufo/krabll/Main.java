package org.jufo.krabll;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Main extends ApplicationAdapter {
    // project-wide attributes (title, height, etc)
    final static String TITLE = "Krabll";
    final static int PIXELSPERUNIT = 5;
    final static int HEIGHTINUNITS = 100;
    final static int WIDTHINUNITS = 100;
    final static int TICKSPERSECOND = 10;
    // selector
    Selector selector;
    // textures, camera and sprite batch
    private Texture krabllOff;
    private Texture krabllOn;
    private OrthographicCamera camera;
    private SpriteBatch batch;
    
    // constructor
    public Main() {
        this.selector = new Selector();
    }
    
    // getter and setter
    public static int getPIXELSPERUNIT(){
        return PIXELSPERUNIT;
    }
    public static int getHEIGTHINUNITS(){
        return HEIGHTINUNITS;
    } 
    public static int getWIDTHINUNITS(){
        return WIDTHINUNITS;
    }
    public static String getTITLE(){
        return TITLE;
    }
    
    // on-create method
    @Override
    public void create() {
        // load textures
        krabllOff = new Texture(Gdx.files.internal("krabll_off.png"));
        krabllOn = new Texture(Gdx.files.internal("krabll_on.png"));
        // initialize camera
        camera = new OrthographicCamera();
        camera.setToOrtho(false, WIDTHINUNITS * PIXELSPERUNIT, HEIGHTINUNITS * PIXELSPERUNIT);
        // initialize sprite batch
        batch = new SpriteBatch();
    }
    
    // render loop
    @Override
    public void render() {

    }
}