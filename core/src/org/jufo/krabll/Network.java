package org.jufo.krabll;


public class Network {
    // binary inputs, neurons and outputs
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
    public void setInputs(boolean[] inputs){
        this.inputs = inputs;
    }
    public Neuron[] getNeurons() {
        return neurons;
    }
    public boolean[] getOutputs() {
        return outputs;
    }
    
    // sets the neurons
    public void setNeurons() {
        for(int a = 0;
                a < neurons.length;
                a++){
            for(int b = 0;
                    b < neurons[a].getConnectedInputs().length;
                    b++){
                if(inputs[b]){
                    neurons[a].setActivatedInputs(neurons[a].getActivatedInputs() + 1);
                }
            }
        }
    }
    
    // sets the outputs
    public void setOutputs() {
        for(int a = 0;
                a < neurons.length;
                a++){
            if(neurons[a].getActivatedInputs() == neurons[a].getTreshold()){
                for(int b = 0;
                        b < neurons[a].getConnectedOutputs().length;
                        b++){
                    outputs[b] = true;
                }
            }
        }
    }
    
    // resets the whole network
    public void reset() {
        for(int a = 0;
                a < inputs.length;
                a++){
            inputs[a] = false;
        }
        for(int a = 0;
                a < neurons.length;
                a++){
            neurons[a].setActivatedInputs(0);
        }
        for(int a = 0;
                a < outputs.length;
                a++){
            outputs[a] = false;
        }
    }
    
}