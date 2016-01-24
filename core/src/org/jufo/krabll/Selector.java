package org.jufo.krabll;


// Selector inherits from Object
public class Selector {
    // population size and elite size (for finding "best" neural network)
    private final int populationSize = 100;
    private final int eliteSize = 10;
    // krablls that are currently alive
    private int krabllsAlive;
    // population and elite array (for storing every krabll)
    private Krabll[] population;
    private Krabll[] elite;
    
    // constructor
    public Selector() {
        this.population = new Krabll[populationSize];
        this.elite = new Krabll[eliteSize];
        createPopulation();
    }
    
    // getter and setter
    public Krabll[] getPopulation(){
        return population;
    }
    public Krabll[] getElite(){
        return elite;
    }
    
    // create a randomly generated population with the size of populationSize
    void createPopulation(){
        // sets the number of krablls, that are alive to the population size
        krabllsAlive = populationSize;
        // loop through populationSize
        for(int a = 0; a < populationSize; a++){
            // initializing random xCoordinate and yCoordinate
            int xCoordinate = (int) (Math.random() * Main.WIDTHINUNITS + 1);
            int yCoordinate = (int) (Math.random() * Main.HEIGHTINUNITS + 1);
            // initializing random rotation
            short rotation = (short) (((short) (Math.random() * 8 + 1)) * 45);
            // initializing mass and speed (for momentum and damage calculation)
            double mass = 10.0D;
            double speed = 1.0D;
            // initializing random neural network
            Network network = randomNetwork();
            // initializing health (for damage calculation)
            int health = 100;
            // initializing krabll
            population[a] = new Krabll(xCoordinate, yCoordinate, rotation,
                                       mass, speed, network, health);
        }
    }
    
    // check, apply and perform every input and output
    // for each krabll in population
    public void checkPopulation(){
        // TODO: delete "dead" krablls
        // check, if there aren't just 10 or less krablls alive
        if(!(krabllsAlive <= eliteSize)){
            // loop through every krabll of the current population
            for(int a = 0; a < populationSize; a++){
                // check and apply inputs for specific krabll
                population[a].applyInputs();
            }
            // loop through every krabll of the current population
            for(int a = 0; a < populationSize; a++){
                // set neurons of spicific neural network
                population[a].getNetwork().setNeurons();
            }
            // loop through every krabll of the current population
            for(int a = 0; a < populationSize; a++){
                // set binary outputs of specific neural network
                population[a].getNetwork().setOutputs();
            }
            // loop through each krabll of the curren population
            for(int a = 0; a < populationSize; a++){
                // performs the outputs for specific krabll
                population[a].performOutputs();
            }
        }
        // create new population based on "top 10" neural networks
        else {
            // loop through every krabll of the current population
            for(int a = 0; a < populationSize; a++){
                // check, if specific krabll is alive
                if(population[a].getNetwork().getInputs()[0]){
                    // copy specific krabll into elite array
                    elite[a] = population[a];
                }
            }
            // create new neural network based on "top 10" neural networks
            Network eliteNetwork = findEliteNetwork();
            // TODO: create new population based on eliteNetwork
        }
    }
    
    // returns mixed neural network of "top 10" krablls (in elite array)
    Network findEliteNetwork() {
        // create new network array
        Network[] eliteNetworks = new Network[eliteSize];
        // loop through elite array
        for(int a = 0; a < eliteSize; a++){
            eliteNetworks[a] = elite[a].getNetwork();
        }
        // mix networks of elite
        Network network = mixNetworks(eliteNetworks);
        // return elite network
        return network;
    }
    
    // generate a random neural network
    Network randomNetwork() {
        // initialize constants like numberOfInputs, numberOfNeurons, numberOfOutputs
        final int numberOfInputs = 14;
        final int numberOfNeurons = 28;
        final int numberOfOutputs = 14;
        // declare input, neuron and output array
        boolean[] inputs = new boolean[numberOfInputs];
        Neuron[] neurons = new Neuron[numberOfNeurons];
        boolean[] outputs = new boolean[numberOfOutputs];
        // initialize every neuron in neuron array
        for(int a = 0; a < neurons.length; a++){
            // initialize random threshold of neuron
            int threshold = (int) (Math.random() * Math.max(numberOfInputs,
                                                            numberOfOutputs) + 1);
            // declare connectedInputs and connectedOutputs of neuron
            int[] connectedInputs = new int[numberOfInputs];
            int[] connectedOutputs = new int[numberOfOutputs];
            // initialize every connected input of the neuron
            for(int b = 0; b < connectedInputs.length; b++){
                connectedInputs[b] = (int) (Math.random() * numberOfInputs + 1);
            }
            // initialize every connected output of the neuron
            for(int b = 0; b < connectedOutputs.length; b++){
                connectedOutputs[b] = (int) (Math.random() * numberOfOutputs + 1);
            }
            // initialize new neuron
            neurons[a] = new Neuron(threshold, connectedInputs, connectedOutputs);
        }
        // initialize new neural network
        Network network = new Network(inputs, neurons, outputs);
        // return randomly generated neural network
        return network;
    }
    
    // mix different neural network
    Network mixNetworks(Network[] networks){
        // TODO: write mixing algorithm
        // return mixed neural network
        return null;
    }
}