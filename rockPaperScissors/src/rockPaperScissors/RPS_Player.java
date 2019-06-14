package rockPaperScissors;

public class RPS_Player {
	//1 = rock
	//2 = paper
	//3 = scissors
	int game = 1;
	int choice1 = (int) (Math.random() * (4 - 1) + 1);
	int choice2 = (int) (Math.random() * (4 - 1) + 1);
	if (choice1 == 1 && choice2 == 2) {
		System.out.println("Player 1 chose Rock and Player 2 chose Paper. Player 2 wins this round!");
	}
	else if (choice1 == 1 && choice2 == 3) {
		System.out.println("Player 1 chose Rock and Player 2 chose Scissors. Player 1 wins this round!");
	}
	else if (choice1 == 1 && choice2 == 1) {
		System.out.println("Both players chose Rock. It's a tie!");
	}
	else if (choice1 == 2 && choice2 == 1) {
		System.out.println("Player 1 chose Paper and Player 2 chose Rock. Player 1 wins this round!");
	}
	else if (choice1 == 2 && choice2 == 2) {
		System.out.println("Both players chose Paper. It's a tie!");
	}
	else if (choice1 == 2 && choice2 == 3) {
		System.out.println("Player 1 chose Paper and Player 2 chose Scissors. Player 2 wins this round!");
	}
	else if (choice1 == 3 && choice2 == 1) {
		System.out.println("Player 1 chose Scissors and Player 2 chose Rock. Player 2 wins this round!");
	}
	else if (choice1 == 3 && choice2 == 2) {
		System.out.println("Player 1 chose Scissors and Player 2 chose Paper. Player 1 wins this round!");
	}
	else if (choice1 == 3 && choice2 == 3) {
		System.out.println("Both players chose Scissors. It's a tie!");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
}
