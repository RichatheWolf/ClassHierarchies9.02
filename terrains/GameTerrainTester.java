
public class GameTerrainTester {
	public static void main(String[] args) {
		Terrain baseCase = new Terrain(150,349);
		System.out.println(baseCase.toString());
		
		Forest woods = new Forest(200,195,700);
		System.out.println(woods.toString());
		
		Mountain kilimanjaro = new Mountain(300,300,30);
		System.out.println(kilimanjaro.toString());
		
		WinterMountain mountFuji = new WinterMountain(320,450,34,32.32);
		System.out.println(mountFuji.toString());
		
		Mesa roraima = new Mesa(300,189,2000);
		System.out.println(roraima.toString());
		
		RainForest amazon = new RainForest(600,750,2050,7);
		System.out.println(amazon.toString());
	}
}