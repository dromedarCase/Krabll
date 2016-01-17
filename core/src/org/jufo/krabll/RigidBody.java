package org.jufo.krabll;


public class RigidBody {
    // position, rotation as well as mass and speed for momentum
    int xCoordinate;
    int yCoordinate;
    short rotation;
    double mass;
    double speed;   // coefficient
    
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