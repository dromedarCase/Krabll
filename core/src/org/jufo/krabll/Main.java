package org.jufo.krabll;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


// Main inherits from ApplicationAdapter (for rendering, etc.)
public class Main extends ApplicationAdapter {
    // title, window height, window width, etc. (for displaying the UI)
    final static String TITLE = "Krabll";
    final static int PIXELSPERUNIT = 5;
    final static int HEIGHTINUNITS = 100;
    final static int WIDTHINUNITS = 100;
    final static int TICKSPERSECOND = 10;
    // textures, camera and sprite batch (for rendering every krabll)
    private Texture krabllOff;
    private Texture krabllOn;
    private OrthographicCamera camera;
    private SpriteBatch batch;
    // selector for handling the entire krabll population
    Selector selector;
    
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
    
    // create method of the window
    @Override
    public void create() {
        // initializing textures
        krabllOff = new Texture(Gdx.files.internal("krabll_off.png"));
        krabllOn = new Texture(Gdx.files.internal("krabll_on.png"));
        camera = new OrthographicCamera();
        // setting camera angle
        camera.setToOrtho(false, WIDTHINUNITS * PIXELSPERUNIT,
                          HEIGHTINUNITS * PIXELSPERUNIT);
        // initializing spritebatch (for "drawing")
        batch = new SpriteBatch();
    }
    
    // render method of the window (should run about 60 times per second)
    @Override
    public void render() {
        // checking every input of every krabll in population
        // selector.checkPopulation();
        // TODO: render everything
    }
}