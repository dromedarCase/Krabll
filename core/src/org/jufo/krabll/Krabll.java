package org.jufo.krabll;


public class Krabll extends RigidBody {
    private Network network;
    int lifetime;
    
    // constructor
    public Krabll(int xCoordinate, int yCoordinate,
                  short rotation, double mass, double speed, Network network){
        super(xCoordinate, yCoordinate, rotation, mass, speed);
        this.network = network;
        lifetime = 0;
    }
    
    // getter and setter
    public Network getNetwork() {
        return network;
    }
    
    // TODO: recognizing inputs
    // applies inputs
    public void applyInputs() {
        
    }
    
    // TODO: performing outputs
    // performs outputs
    public void performOutputs() {
        lifetime++;
    }
    
    public int getLifetime() {
    }
        return lifetime;
    }
    
    @Override
    public int compareTo(Krabbl o) {
        return lifetime.compareTo(o.lifetime);
    }
}
