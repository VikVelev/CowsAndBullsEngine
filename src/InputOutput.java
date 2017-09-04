
import java.util.Scanner;
import java.util.ArrayList;;

public class InputOutput {
	
	public String input() {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		ArrayList <Character> cont = new ArrayList<>();
		
		for(int i=0; i<input.length(); i++) {
			
			char s = input.charAt(i);
			
			if(cont.contains(s)) {
				
				output( "Symbol " + s + " appears more than once. Please, type a new number.");
				
				return "error";
				
			}
			
			cont.add(s);	
			
		}
		
		return input;
		
	}
	
	public void output(String error) {
		
		System.out.println("There was an error: " + error);
	}
	
	public void outputMessage(String str) {
		System.out.println(str);
	}
	
	public void output(int cows, int bulls, int digs) {
		
		String cowStr = "";
		String bullStr = "";
		
		if(cows == 1) {
			cowStr = "cow";
		} else {
			cowStr = "cows";
		}
		
		if(bulls == 1) {
			bullStr = "bull";
		} else {
			bullStr = "bulls";
		}
		
		System.out.println("There are " + cows + " " + cowStr + ", " + bulls + " " + bullStr);	
		
		if(bulls == digs) {
			System.out.println("Congratulations, you win!");
		}
	}
}
