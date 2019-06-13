
public class StringJumble {
	
	public static String jumbleString(String input) {
		String output = "";
		String [] myArray = new String[3];
		for (int i = 0; i < 3; i++) {
			int a = (int) (Math.random() * (input.length()));
			int b = (int) (Math.random() * (input.length()));
			if (a > b) {
				myArray[i] = input.substring(b, a);
			}
			else {
				myArray[i] = input.substring(a, b);
			}
		}
		return myArray[0] + myArray[1] + myArray [2];
			
	}
		

	
		
	
	

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(jumbleString("hello hello hello"));

		}

}
