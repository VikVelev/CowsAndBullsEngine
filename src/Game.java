
public class Game {
	
	public  void play(String randNum, int digs) {
		
		
		
		InputOutput io = new InputOutput();
		
		for(;;) {
			
			String input = io.Input();
			
			if(input.equals("error")) {
				
				continue;
			}
			
			else {
				
				Processing process = new Processing(input, randNum);
				
				int cows = process.res[0];
				int bulls = process.res[1];
				
				io.Output(cows, bulls, digs);
				
				if(bulls == digs) {
					break;
				}
				
			}
		}
	}
	
		
}
