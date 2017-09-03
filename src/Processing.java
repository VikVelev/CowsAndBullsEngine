
public class Processing {
	
	public String input;
	public String num;
	
	//record cows and bulls
	//0 stores cows
	//1 stores bulls
			
	public int[] res = new int[2];
	
	public Processing(String str_input, String str_num){
		
		input = str_input;
		num = str_num;
		find_matches();
		
		
		
		
		
		
	}
	
	public void find_matches() {
		
		res[0] = 0;
		res[1] = 0;
		for(int i=0; i<input.length(); i++) {
			
			char symb = input.charAt(i);
			
			int find_res = init(symb);
			
			//System.out.println(symb + " " + find_res);
			
			if(find_res == 0) {
				res[0]++;
			}
			
			if(find_res == 1) {
				res[1]++;
			}
		}
	}
	
	public int init(char symb) {
		
		//return -1 if symb is not in the number
		// return 0 for cow
		//return 1 for bull
		
		int idx = num.indexOf(symb);
		
		
		if(idx == -1) {
			 return -1;
		}
		
		
		else if(input.indexOf(symb) == idx) {
			
			return 1;
		}
		
		else {
			return 0;
		}
		
	}
}
