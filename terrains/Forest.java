public class Forest extends Terrain{
	int noOfTrees;
	
	
	public Forest(int dimensionLength, int dimensionWidth,int numberOfTrees) {
		super(dimensionLength, dimensionWidth);
		this.noOfTrees = numberOfTrees;
	}
	
	public String toString(){
		String output = "The forest has dimensions " + dimensionLength + " x " +dimensionWidth
				+" and has " + noOfTrees + " trees.";
		return output;
	}
	
	public int getNoOfTrees() {
		return noOfTrees;
	}
	
	public void setNoOfTrees(int noOfTrees) {
		this.noOfTrees = noOfTrees;
	}
	
}