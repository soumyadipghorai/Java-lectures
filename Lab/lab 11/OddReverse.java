public class OddReverse {
	
	public String reverseOdd(String input) {
		String output = "";
	
		if (input.length() % 2 != 0) {
			
			for (int i = input.length() - 1; i >= 0; i--) {
				output += input.charAt(i);
			}
			
			return output;
		} 
		
		else
			return input;
	}
}