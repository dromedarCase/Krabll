package org.jufo.krabll;


public class Selector {
    Krabll[] krablls;
    
    // TODO: write selecting/generating algorithm
    public Selector(){
        
    }
    
    // TODO: generate links randomly
    public Network randomNetwork(){
        boolean[] inputs = new boolean[14];
        boolean[] outputs = new boolean[14];
        Neuron[] neurons = new Neuron[28];
        for(int a = 0; a < neurons.length; a++){
            neurons[a].threshold = (int) (Math.random() * 14 + 1);
        }
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
