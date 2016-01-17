package org.jufo.krabll;


public class Krabll extends RigidBody {
    Network network;
    
    public Krabll(int xCoordinate, int yCoordinate,
                  short rotation, double mass, double speed, Network network){
        super(xCoordinate, yCoordinate, rotation, mass, speed);
        this.network = network;
    }
    
    // TODO: recognizing inputs
    // applies inputs
    public void applyInputs(){
        
    }
    
    // TODO: performing outputs
    // performs outputs
    public void performOutputs(){
        
    }
}
