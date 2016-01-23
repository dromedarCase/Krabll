package org.jufo.krabll;


// Krabll inherits from RigidBody (for physics, etc.)
public class Krabll extends RigidBody {
    // neural network ("brain")
    private Network network;
    // health (for damage recognition, etc.)
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
    
    // recognizing inputs and applying them to the neural network
    public void applyInputs() {
        // check, wether krabll is dead
        if(health <= 0){
            network.setInputs(0, false);
        }
        // TODO: recognizing other inputs
    }
    
    // reading binary outputs from neural network and performing them
    public void performOutputs() {
        // TODO: check network.getOutputs();
    }
}