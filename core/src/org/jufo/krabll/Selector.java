package org.jufo.krabll;


public class Selector {
    private Krabll[] krablls;
    final static int eliteSize = 10;
    
    // TODO: write selecting/generating algorithm
    // constructor
    public Selector(Krabll[] krablls) {
        this.krablls = krablls;
    }
    
    // creates a new set of krablls
   /* Krabll[] execute() {
        Krabll[] selectedKrablls = select();
        return mixNetworks(selectedKrablls);
    }*/
    
    // selects the krablls to form the new generation
    Krabll[] select() {
        Array.sort(krablls);
        
        Krabll[] survivors = new Krabll[eliteSize]();
        for (int i = 0; i <= eliteSize; i++) {
            survivors[i] = krablls[krablls.length - (i + 1)];
        }
    }
    
    // TODO: generate links randomly
    // generates a random neural network
    Network randomNetwork() {
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
    Krabll[] mixNetworks(Krabll[] networks){
        return networks;
    }
    */
}
