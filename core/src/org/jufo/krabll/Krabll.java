package org.jufo.krabll;


public class Krabll extends RigidBody {
    // neural network
    private Network network;
    private int health;
    
    // constructor
    public Krabll(int xCoordinate, int yCoordinate,
                  short rotation, double mass,
                  double speed, Network network, int health){
        super(xCoordinate, yCoordinate, rotation, mass, speed);
        this.network = network;
        this.health = health;
    }
    
    // getter and setter
    public Network getNetwork() {
        return network;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    
    // checks and applies inputs
    public void applyInputs() {
        // checks if Krabll is alive
        if(health <= 0){
            network.setInputs(0, false);
        }
        // TODO: recognizing inputs
    }
    
    // performs outputs
    public void performOutputs() {
        // TODO: check network.getOutputs();
    }
}