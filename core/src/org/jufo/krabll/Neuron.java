package org.jufo.krabll;


public class Neuron {
    // threshold, activatedInputs, connectedInputs and connectedOutputs for
    // network operations
    private int threshold;
    private int activatedInputs;
    private int[] connectedInputs;
    private int[] connectedOutputs;
    
    // constructor
    public Neuron(int threshold, int[] connectedInputs, int[] connectedOutputs){
        this.threshold = threshold;
        activatedInputs = 0;
        this.connectedInputs = connectedInputs;
        this.connectedOutputs = connectedOutputs;
    }
    
    // getter and setter
    public int getTreshold(){
        return threshold;
    }
    public void setThreshold(int threshold){
        this.threshold = threshold;
    }
    public int getActivatedInputs(){
        return activatedInputs;
    }
    public void setActivatedInputs(int activatedInputs){
        this.activatedInputs = activatedInputs;
    }
    public int[] getConnectedInputs(){
        return connectedInputs;
    }
    public void setConnectedInputs(int[] connectedInputs){
        this.connectedInputs = connectedInputs;
    }
    public int[] getConnectedOutputs(){
        return connectedOutputs;
    }
    public void setConnectedOutputs(int[] connectedOutputs){
        this.connectedOutputs = connectedOutputs;
    }
}