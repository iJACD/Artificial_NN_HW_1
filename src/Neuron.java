
public class Neuron {
	public static final int[][][] andData = {{{0,0},{0}},
											 {{0,1},{0}},
											 {{1,0},{0}},
											 {{1,1},{1}}};
	public static final double LEARNING_RATE = 0.05;
	public static final double[] INITIAL_WEIGHTS = {Math.random(), Math.random()};
	
	public double calcWeightedSum(int[] data, double[] weights){
		double weightedSum = 0;
		return weightedSum;
	}
	
	public int applyActivationFunc(double sigmoid){
		return 0;
	}
	
	public double[] adjustWeight(int[] data, double weights, double error){
		return null;
	}
}
