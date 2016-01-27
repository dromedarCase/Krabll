package org.jufo.krabll;


// RigidBody inherits from Object
public class RigidBody {
    // width, height, xCoordinate, yCoordinate, rotation,
    // mass and speed (for physics and rendering)
    final int width;
    final int height;
    int xCoordinate;
    int yCoordinate;
    int rotation;
    double mass;
    double speed;
    
    // constructor
    public RigidBody(int width, int height,
                     int xCoordinate, int yCoordinate,
                     int rotation,
                     double mass, double speed){
        this.width = width;
        this.height = height;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.rotation = rotation;
        this.mass = mass;
        this.speed = speed;
    }
    
    // getter and setter
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
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