
public class Start {
	
	public static void start() {

		GenerateRandom gen_rand = new GenerateRandom();
		Game game = new Game();
		
		String randNum = gen_rand.getRand(4);
		
		game.play(randNum);
		
		
		
		
	}
	
	
}
