
public class Neuron implements samples{
	/*public static final int[][][] andData = {{{0,0},{0}},
											 {{0,1},{0}},
											 {{1,0},{0}},
											 {{1,1},{1}}};*/
	public static final double[][] inLayer = inputs;
	//public static final double LEARNING_RATE = 0.1;
	public static final double[] INITIAL_WEIGHTS = {Math.random(), Math.random()};
	
	public double calcWeightedSum(int[] data, double[] weights){
		double weightedSum = 0;
		for(int x = 0;x<data.length;x++){
			weightedSum += data[x]*weights[x]; 
		}
		return weightedSum;
	}
	
	public double applySigmoidFunc(double weightedSum){
		double result = (1/(1+Math.pow(Math.E, -weightedSum)));
		return result;
	}
	
	public int applyActivationFunc(double weightedSum){
		int result = 0;
		if(weightedSum > 1)
			result = 1;
		return result;
	}
	
	public double[] adjustWeight(int[] data, double[] weights, double error){
		double adjustedWeights[] = new double[weights.length];
		for(int x=0; x<weights.length; x++){
			//adjustedWeights[x] = LEARNING_RATE*error*data[x] + weights[x];
		}
		return adjustedWeights;
	}
}
