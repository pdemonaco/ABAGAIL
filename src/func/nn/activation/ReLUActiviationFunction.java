package func.nn.activation;

/**
 * A Rectified Linear Unit (ReLU)
 * 
 * This wikipedeia article provides a fairly good overview.
 * https://en.wikipedia.org/wiki/Rectifier_(neural_networks)
 * 
 * Also, note that the derivative is an approximation.
 * It is technically not defined at the value 0. Further 
 * details can be found at the following site.
 * http://mochajl.readthedocs.io/en/latest/user-guide/neuron.html
 * @author Phil DeMonaco pdemon@gmail.com
 * @version 1.0
 */
public class ReLUActiviationFunction extends DifferentiableActivationFunction {

    /**
     * @see nn.function.DifferentiableActivationFunction#derivative(double)
     */
    public double derivative(double value) {
        return (value > 0) ? 1 : 0;
    }

    /**
     * @see nn.function.ActivationFunction#activation(double)
     */
    public double value(double value) {
        return Math.max(value, 0);
    }

}
