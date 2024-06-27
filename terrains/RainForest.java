public class RainForest extends Forest{
	int noOfRivers;
	public RainForest(int dimensionLength, int dimensionWidth, int numberOfTrees,int numberOfRivers){
		super(dimensionLength, dimensionWidth, numberOfTrees);
		this.noOfRivers = numberOfRivers;
	}
	
	public String toString(){
		String output = "The rain forest has dimensions " + dimensionLength + " x " +dimensionWidth + " and has " + noOfRivers + " rivers "
				+" and has " + noOfTrees + " trees.";
		return output;
	}
	
}