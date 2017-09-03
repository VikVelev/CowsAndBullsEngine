
public class InputOutput {
	
	public static void Input() {
		
	}
	
	public static void Ouput(String error) {
		System.out.println("There was an error: " + error);
	}
	
	public static void Output(int cows, int bulls) {
		
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
		
		System.out.println("There are" + cows + " " + cowStr + ", " + bulls + " " + bullStr);	
	}
}
