package org.jufo.krabll;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


// Main inherits from ApplicationAdapter (for rendering, etc.)
public class Main extends ApplicationAdapter {
    // title, window height, window width, etc. (for displaying the UI)
    final static String TITLE = "Krabll";
    final static int PIXELSPERUNIT = 5;
    final static int WIDTHINUNITS = 100;
    final static int HEIGHTINUNITS = 100;
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
        
    }
    
    // getter and setter
    public static int getPIXELSPERUNIT(){
        return PIXELSPERUNIT;
    }
    public static int getWIDTHINUNITS(){
        return WIDTHINUNITS;
    }
    public static int getHEIGTHINUNITS(){
        return HEIGHTINUNITS;
    } 
    public static String getTITLE(){
        return TITLE;
    }
    
    // create method of the window
    @Override
    public void create() {
        // initialize selector
        this.selector = new Selector();
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
        // check every input of every krabll in population
        // selector.checkPopulation();
        // set clear color
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        // clear canvas
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        // update camera
        camera.update();
        // set projection matrix
        batch.setProjectionMatrix(camera.combined);
        // begin "drawing"
        batch.begin();
        // loop through every krabll in population
        for(int a = 0; a < selector.getPopulationSize(); a++){
            // check if krabll is alive
            if(selector.getPopulation()[a].getNetwork().getInputs()[0]){
                // draw specific krabll
                batch.draw(krabllOff,
                           (selector.getPopulation()[a].getXCoordinate() - 20 / 2) * PIXELSPERUNIT,
                           (selector.getPopulation()[a].getYCoordinate() - 5 / 2) * PIXELSPERUNIT);
                // TODO: render rotation
            }
        }
        // stop "drawing"
        batch.end();
    }
}