public class Mesa extends Terrain{
	int elevation;
	
	public Mesa(int dimensionLength, int dimensionWidth,int elevation) {
		super(dimensionLength, dimensionWidth);
		this.elevation = elevation;
	}
	
	public String toString() {
		String output = "The mesa has dimensions " + dimensionLength + " x " +dimensionWidth + " and an elevation of "+elevation +"meters.";
		return output;
	}
}