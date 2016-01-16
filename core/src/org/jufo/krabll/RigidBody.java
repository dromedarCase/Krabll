package org.jufo.krabll;


public class RigidBody {
    //position on the plane
    double xCoordinate;
    double yCoordinate;
    short rotation;
    
    //movement and collision handling
    int mass;
    double speed;
    double length;
    
    public RigidBody(double xCoordinate, double yCoordinate, short rotation){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.rotation = rotation;
        this.mass = 0;
        this.speed = 0;
    }
    
    public RigidBody(double xCoordinate, double yCoordinate, short rotation, int mass){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.rotation = rotation;
        this.mass = mass;
        this.speed = 0;
    }
}
