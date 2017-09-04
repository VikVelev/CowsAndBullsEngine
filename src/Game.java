
public class Game {
	
	public void play(String randNum, int digs) {
		
		InputOutput io = new InputOutput();
		
		io.outputMessage("Try to guess my number! It is " + digs + " digits");
		
		for(;;) {
			
			String input = io.input();
			
			if(input.equals("error")) {
				
				continue;
			}
			
			else {
				
				Processing process = new Processing(input, randNum);
				
				int cows = process.res[0];
				int bulls = process.res[1];
				
				io.output(cows, bulls, digs);
				
				if(bulls == digs) {
					break;
				}
				
			}
		}
	}
	
}
