package org.jufo.krabll;


// Neuron inherits from Object
public class Neuron {
    // threshold (value, that must be "reached", to "enable" the neuron)
    private int threshold;
    // number of activated inputs
    private int activatedInputs;
    // index of every connected input
    private int[] connectedInputs;
    // inex of every connected output
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
    public void setConnectedInputs(int index, int value){
        this.connectedInputs[index] = value;
    }
    public int[] getConnectedOutputs(){
        return connectedOutputs;
    }
    public void setConnectedOutputs(int index, int value){
        this.connectedOutputs[index] = value;
    }
}