
public class gamecharacter implements tests{

	public static void main(String[] args) {
		//int[][][] data = Neuron.andData;
		double learningRate = 0.0;
		String activationFunc = null; 
		if(args.length != 0){
			learningRate = Double.parseDouble(args[0]);
			activationFunc = args[1];
		}
		double[] weights = Neuron.INITIAL_WEIGHTS;
		gamecharacter gamechar = new gamecharacter();
		Neuron neuron = new Neuron();
		int epochNumber = 0;
		
		boolean errorFlag = true;
		double error = 0;
		
		double[] adjustedWeights = null;
		System.out.println("Learning rate: "+learningRate+"\nActivation Function: "+activationFunc);
		/*while(errorFlag){
			driver.printHeading(epochNumber++);
			errorFlag = false;
			error = 0;
			for(int x=0; x<data.length;x++){
				double weightedSum = neuron.calcWeightedSum(data[x][0], weights);
				double result = neuron.applyActivationFunc(weightedSum);
				error = data[x][1][0] - result;
				if(error != 0) 
					errorFlag = true;
				adjustedWeights = neuron.adjustWeight(data[x][0], weights, error);
				driver.printVector(data[x], weights, result, error, weightedSum, adjustedWeights);
				weights = adjustedWeights;
			}
		}*/
	}
	
	/*public void printHeading(int epochNumber) {
		System.out.println("\n==========================================Epoch # "+epochNumber+ "=====================================================");
		System.out.println("   w1 |  w2  | x1 | x2 | Target Result | Result | error | Weighted Sum | adjusted w1 | ajusted w2");
		System.out.println("--------------------------------------------------------------------------------------------------------");
	}
	public void printVector(int[][] data, double[] weights, double result, double error, double weightedSum, double[] adjustedWeights){
		System.out.println(" "+String.format("%.2f",weights[0])+" | "+String.format("%.2f",weights[1])+" | "+data[0][0]+"  | "+data[0][1]+
						   "  |	"+data[1][0]+"      |  "+result+"   | "+error+"	|     "+String.format("%.2f",weightedSum) + 
						   "     |     "+String.format("%.2f",adjustedWeights[0])+"    |   "+String.format("%.2f",adjustedWeights[1]));
	}*/
	
}
