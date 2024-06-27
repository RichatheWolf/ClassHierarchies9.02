public class Terrain {
	int dimensionLength;
	int dimensionWidth;
	
	public Terrain(int dimensionLength, int dimensionWidth){
			this.dimensionLength = dimensionLength;
			this.dimensionWidth = dimensionWidth;
	}
	
	public int getDimensionLength() {
			return dimensionLength;
	}
	public void setDimensionLength(int dimensionLength) {
		this.dimensionLength = dimensionLength;
	}
	
	public int getDimensionWidth() {
		return dimensionWidth;
	}
	
	public void setDimensionWidth(int dimensionWidth) {
		this.dimensionWidth = dimensionWidth;
	}
	
	public String toString(){
		String output = "The land has dimensions " + dimensionLength + " x " +dimensionWidth + ".";
		return output;
	}
	
}

