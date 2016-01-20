package org.jufo.krabll;


// Network inherits from Object
public class Network {
    // binary inputs, neurons and outputs (for "thinking")
    private boolean[] inputs;
    private Neuron[] neurons;
    private boolean[] outputs;
    
    // constructor
    public Network(boolean[] inputs, Neuron[] neurons, boolean[] outputs) {
        this.inputs = inputs;
        this.neurons = neurons;
        this.outputs = outputs;
    }
    
    // getter and setter
    public boolean[] getInputs() {
        return inputs;
    }
    public void setInputs(int index, boolean value){
        this.inputs[index] = value;
    }
    public Neuron[] getNeurons() {
        return neurons;
    }
    public boolean[] getOutputs() {
        return outputs;
    }
    
    // scanning binary inputs and setting the corresponding binary neurons
    public void setNeurons() {
        // loop through every neuron
        for(int a = 0;
                a < neurons.length;
                a++){
            // loop through every connected input of the neuron
            for(int b = 0;
                    b < neurons[a].getConnectedInputs().length;
                    b++){
                // count activated neurons
                if(inputs[b]){
                    neurons[a].setActivatedInputs(neurons[a].getActivatedInputs() + 1);
                }
            }
        }
    }
    
    // scanning binary neurons and setting the corresponding binary outputs
    public void setOutputs() {
        // loop through every neuron
        for(int a = 0;
                a < neurons.length;
                a++){
            // check, if neuron is "activated"
            if(neurons[a].getActivatedInputs() == neurons[a].getTreshold()){
                // loop through every connected output
                for(int b = 0;
                        b < neurons[a].getConnectedOutputs().length;
                        b++){
                    // activate corresponding binary output
                    outputs[b] = true;
                }
            }
        }
    }
    
    // reset every binary input, neuron and output
    public void reset() {
        // loop through every input
        for(int a = 0;
                a < inputs.length;
                a++){
            // disable input
            inputs[a] = false;
        }
        // loop through every neuron
        for(int a = 0;
                a < neurons.length;
                a++){
            // reset activated inputs
            neurons[a].setActivatedInputs(0);
        }
        // loop through every output
        for(int a = 0;
                a < outputs.length;
                a++){
            // disable output
            outputs[a] = false;
        }
    }
    
}