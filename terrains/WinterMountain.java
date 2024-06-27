public class WinterMountain extends Mountain {
	double temperature;
	
	public WinterMountain(int dimensionLength, int dimensionHeight,int numberOfMountains,double temperature){
		super(dimensionLength, dimensionHeight,numberOfMountains);
		this.temperature = temperature;
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public String toString(){
		String output = "The winter mountain has dimensions " + dimensionLength + " x " +dimensionWidth + " and has "+ numberOfMountains + " mountains and temperature of " + temperature + " degrees.";
		return output;
	}
}
