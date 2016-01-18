package org.jufo.krabll;


public class Krabll extends RigidBody {
    // neural network
    private Network network;
    
    int lifetime;
    
    // constructor
    public Krabll(int xCoordinate, int yCoordinate,
                  short rotation, double mass,
                  double speed, Network network){
        super(xCoordinate, yCoordinate, rotation, mass, speed);
        this.network = network;
        lifetime = 0;
    }
    
    // getter and setter
    public Network getNetwork() {
        return network;
    }
    
    // checks and applies inputs
    public void applyInputs() {
        // TODO: recognizing inputs
    }
    
    // performs outputs
    public void performOutputs() {
        // TODO: check network.getOutputs();
        lifetime++;
    }
}