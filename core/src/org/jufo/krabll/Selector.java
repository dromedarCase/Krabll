package org.jufo.krabll;


public class Selector {
    Krabll[] krablls;
    
    public Selector(){  // TODO: write selecting/generating algorithm
        
    }
    
    public Network randomNetwork(){
        boolean[] inputs = null;    // TODO: set inputs
        boolean[] outputs = null;   // TODO: set outputs
        Neuron[] neurons = null;    // TODO: set neurons
        Network network = new Network(inputs, neurons, outputs);
        return network;
    }
    
    /*
    public Network mixNetworks(Network[] networks){ //TODO: write mixing algorithm
        return network;
    }
    */
}
