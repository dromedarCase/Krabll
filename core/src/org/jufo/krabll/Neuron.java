package org.jufo.krabll;


public class Neuron {
    int threshold;
    int[] connectedInputs;
    int[] connectedOutputs;
    
    public Neuron(int thres, int[] con, int[] conOut){
        threshold = thres;
        connectedInputs = conIn;
        connectedOutputs = conOut;
    }
}
