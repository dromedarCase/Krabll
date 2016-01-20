package org.jufo.krabll;


// RigidBody inherits from Object
public class RigidBody {
    // xCoordinate, yCoordinate, rotation,
    // mass and speed (for physics and rendering)
    int xCoordinate;
    int yCoordinate;
    short rotation;
    double mass;
    double speed;
    
    // constructor
    public RigidBody(int xCoordinate, int yCoordinate, short rotation,
                     double mass, double speed){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.rotation = rotation;
        this.mass = mass;
        this.speed = speed;
    }
    
    // getter and setter
    public int getXCoordinate(){
        return xCoordinate;
    }
    public int getYCoordinate(){
        return yCoordinate;
    }
    public int getRotation(){
        return rotation;
    }
    public double getMass(){
        return mass;
    }
    public double getSpeed(){
        return speed;
    }
}