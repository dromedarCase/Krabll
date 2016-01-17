package org.jufo.krabll;


public class Selector {
    Krabll[] krablls;
    
    // TODO: write selecting/generating algorithm
    public Selector(){
        
    }
    
    public Network randomNetwork(){
        boolean[] inputs = null;    // TODO: set inputs
        boolean[] outputs = null;   // TODO: set outputs
        Neuron[] neurons = null;    // TODO: set neurons
        Network network = new Network(inputs, neurons, outputs);
        return network;
    }
    
    /*
    //TODO: write mixing algorithm
    public Network mixNetworks(Network[] networks){
        return network;
    }
    */
}
