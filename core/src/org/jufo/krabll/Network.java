package org.jufo.krabll;


public class Network {
    boolean[] inputs;
    Neuron[] neurons;
    boolean[] outputs;
    
    public Network(boolean[] inputs, Neuron[] neurons, boolean[] outputs){    //TODO: connect input with outputs
        this.inputs = inputs;
        this.neurons = neurons;
        this.outputs = outputs;
    }
    
    public void setNeurons(){
        for(int a = 0; a < neurons.length; a++){
            for(int b = 0; b < neurons[a].connectedInputs.length; b++){
                // TODO: set inputs
            }
        }
    }
    
    public void setOutputs(){
        for(int a = 0; a < neurons.length; a++){
            // TODO: set outputs
        }
    }
    
    public void reset(){
        for(int a = 0; a < inputs.length; a++){
            inputs[a] = false;
        }
        for(int a = 0; a < neurons.length; a++){
            neurons[a].activatedInputs = 0;
        }
        for(int a = 0; a < outputs.length; a++){
            outputs[a] = false;
        }
    }
    
}
