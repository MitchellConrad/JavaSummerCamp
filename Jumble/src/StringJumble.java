
public class StringJumble {
	
	public static String jumbleString(String input) {
		int jumbledStart[] = new int[3];
		int jumbledEnd[] = new int [3];
		jumbledStart[0] = (int) (Math.random() * 10);
		jumbledStart[1] = (int) (Math.random() * 10);
		jumbledStart[2] = (int) (Math.random() * 10);
		jumbledEnd[0] = (int) (Math.random() * 10);
		jumbledEnd[1] = (int) (Math.random() * 10);
		jumbledEnd[2] = (int) (Math.random() * 10);
		int max = jumbledStart[0];
		int middle = 0;
		int min = 0;
		if (jumbledStart[0] > jumbledStart[1]){
			if (jumbledStart[0] > jumbledStart[2]) {
				jumbledStart[0] = max;
				if (jumbledStart[1] > jumbledStart[2]) {
					jumbledStart[1] = middle;
					jumbledStart[2] = min;
				}
				else {
					jumbledStart[2] = middle;
					jumbledStart[1] = min;
				}
			}
			else {
				jumbledStart[2] = max;
				jumbledStart[1] = min;
				jumbledStart[0] = middle;
					
				}	
		}
		else {
			if (jumbledStart[1] > jumbledStart[2]) {
				jumbledStart[1] = max;
				if (jumbledStart[0] > jumbledStart[2]) {
					jumbledStart[0] = middle;
					jumbledStart[2] = min;
				}
				else {
					jumbledStart[2] = middle;
					jumbledStart[0] = min;
				}
			}
			else {
				jumbledStart[2] = max;
				jumbledStart [1] = middle;
				jumbledStart [0] = min;
			}
		}
	}
	

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		}

}
