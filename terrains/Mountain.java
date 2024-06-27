public class Mountain extends Terrain{
	int numberOfMountains;
	
	public Mountain(int dimensionLength, int dimensionWidth,int numberOfMountains) {
		super(dimensionLength, dimensionWidth);
		this.numberOfMountains = numberOfMountains;
	}
	
	public int getNumberOfMountains() {
		return numberOfMountains;
	}
	
	public void setNumberOfMountains(int numberOfMountains) {
		this.numberOfMountains = numberOfMountains;
	}
	
	public String toString(){
		String output = "The mountain has dimensions " + dimensionLength + " x " +dimensionWidth + " and has " + numberOfMountains + " mountains.";
		return output;
	}
}
