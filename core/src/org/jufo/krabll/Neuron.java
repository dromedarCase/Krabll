package org.jufo.krabll;


public class Neuron {
    int threshold;
    int[] connectedInputs;
    int[] connectedOutputs;
    
    public Neuron(int threshold, int[] connectedInputs, int[] connectedOutputs){
        this.threshold = threshold;
        this.connectedInputs = connectedInputs;
        this.connectedOutputs = connectedOutputs;
    }
}
