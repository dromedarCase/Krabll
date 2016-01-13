package org.jufo.krabll;


public class Krabll extends RigidBody { // TODO: write input/output methods
    private Network network;
    
    public Krabll(int xCoordinate, int yCoordinate,
                  short rotation, Network network){
        super(xCoordinate, yCoordinate, rotation);
        this.network = network;
    }
}
