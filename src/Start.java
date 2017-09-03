
public class Start {
	
	public static void start() {

		GenerateRandom gen_rand = new GenerateRandom();
		Game game = new Game();
		
		int digs = 4;
		String randNum = gen_rand.getRand(digs);
		
		game.play(randNum, digs);
		
		
		
		
	}
	
	
}
