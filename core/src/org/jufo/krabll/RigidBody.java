package org.jufo.krabll;


public class RigidBody {
    // position, rotation as well as mass and speed for momentum
    double xCoordinate;
    double yCoordinate;
    short rotation;
    double mass;
    double speed;   // coefficient (shouldn't be 0)
    
    public RigidBody(double xCoordinate, double yCoordinate, short rotation,
                     double mass, double speed){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.rotation = rotation;
        this.mass = mass;
        this.speed = speed;
    }
}