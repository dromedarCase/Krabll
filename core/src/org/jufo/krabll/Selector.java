package org.jufo.krabll;


public class Selector {
    private Krabll[] krablls;
    
    // TODO: write selecting/generating algorithm
    // constructor
    public Selector(){
        
    }
    
    //getter and setter
    public Krabll[] getKrablls(){
        return krablls;
    }
    
    // TODO: generate links randomly
    // generates a random neural network
    public Network randomNetwork(){
        boolean[] inputs = new boolean[14];
        boolean[] outputs = new boolean[14];
        Neuron[] neurons = new Neuron[28];
        for(int a = 0; a < neurons.length; a++){
            neurons[a].setThreshold((int) (Math.random() * 14 + 1));
        }
        Network network = new Network(inputs, neurons, outputs);
        return network;
    }
    
    /*
    // TODO: write mixing algorithm
    // mixes multiple neural networks
    public Network mixNetworks(Network[] networks){
        return network;
    }
    */
}
