package rockPaperScissors;

public class RPS_Player {

	//1 = rock
	//2 = paper
	//3 = scissors
	RPS_Player () {
		
	}
	static void gameRPS() {
	for (int game = 0; game <= 7; game++) {
	int choice1 = (int) (Math.random() * (4 - 1) + 1);
	int choice2 = (int) (Math.random() * (4 - 1) + 1);
if ((game == 6) || (game == 7)) {
	//before last game
	if (game == 6) {
		if (choice1 == 1 && choice2 == 2) {
		System.out.println("Player 1 chose Rock and Player 2 chose Paper. Player 2 wins this round!");
		System.out.println("Final round!");
		}
	else if (choice1 == 1 && choice2 == 3) {
		System.out.println("Player 1 chose Rock and Player 2 chose Scissors. Player 1 wins this round!");
		System.out.println("Final round!");
		}
	else if (choice1 == 1 && choice2 == 1) {
		System.out.println("Both players chose Rock. It's a tie!");
		game--;
		System.out.println("Rematch time!");
	}
	else if (choice1 == 2 && choice2 == 1) {
		System.out.println("Player 1 chose Paper and Player 2 chose Rock. Player 1 wins this round!");
		System.out.println("Final round!");
		}
	else if (choice1 == 2 && choice2 == 2) {
		System.out.println("Both players chose Paper. It's a tie!");
		game--;
		System.out.println("Rematch time!");
	}
	else if (choice1 == 2 && choice2 == 3) {
		System.out.println("Player 1 chose Paper and Player 2 chose Scissors. Player 2 wins this round!");
		System.out.println("Final round!");
		}
	else if (choice1 == 3 && choice2 == 1) {
		System.out.println("Player 1 chose Scissors and Player 2 chose Rock. Player 2 wins this round!");
			System.out.println("Final round!");
		}
	else if (choice1 == 3 && choice2 == 2) {
		System.out.println("Player 1 chose Scissors and Player 2 chose Paper. Player 1 wins this round!");
			System.out.println("Final round!");
		}
	else if (choice1 == 3 && choice2 == 3) {
		System.out.println("Both players chose Scissors. It's a tie!");
		game--;
		System.out.println("Rematch time!");
		}
		}
	//game 7
	else {
	if (choice1 == 1 && choice2 == 2) {
		System.out.println("Player 1 chose Rock and Player 2 chose Paper. Player 2 wins this round!");
		System.out.println("Final round!");
		}
	else if (choice1 == 1 && choice2 == 3) {
		System.out.println("Player 1 chose Rock and Player 2 chose Scissors. Player 1 wins this round!");
		System.out.println("Final round!");
		}
	else if (choice1 == 1 && choice2 == 1) {
		System.out.println("Both players chose Rock. It's a tie!");
		game--;
		System.out.println("Rematch time!");
	}
	else if (choice1 == 2 && choice2 == 1) {
		System.out.println("Player 1 chose Paper and Player 2 chose Rock. Player 1 wins this round!");
		System.out.println("Final round!");
		}
	else if (choice1 == 2 && choice2 == 2) {
		System.out.println("Both players chose Paper. It's a tie!");
		game--;
		System.out.println("Rematch time!");
	}
	else if (choice1 == 2 && choice2 == 3) {
		System.out.println("Player 1 chose Paper and Player 2 chose Scissors. Player 2 wins this round!");
		System.out.println("Final round!");
		}
	else if (choice1 == 3 && choice2 == 1) {
		System.out.println("Player 1 chose Scissors and Player 2 chose Rock. Player 2 wins this round!");
			System.out.println("Final round!");
		}
	else if (choice1 == 3 && choice2 == 2) {
		System.out.println("Player 1 chose Scissors and Player 2 chose Paper. Player 1 wins this round!");
			System.out.println("Final round!");
		}
	else if (choice1 == 3 && choice2 == 3) {
		System.out.println("Both players chose Scissors. It's a tie!");
		game--;
		System.out.println("Rematch time!");
		}
		}
}
	//first few games

	else {
		if (choice1 == 1 && choice2 == 2) {
			System.out.println("Player 1 chose Rock and Player 2 chose Paper. Player 2 wins this round!");
			System.out.println("Next round!");
			}
		else if (choice1 == 1 && choice2 == 3) {
			System.out.println("Player 1 chose Rock and Player 2 chose Scissors. Player 1 wins this round!");
			System.out.println("Next round!");
			}
		else if (choice1 == 1 && choice2 == 1) {
			System.out.println("Both players chose Rock. It's a tie!");
			game--;
			System.out.println("Rematch time!");
		}
		else if (choice1 == 2 && choice2 == 1) {
			System.out.println("Player 1 chose Paper and Player 2 chose Rock. Player 1 wins this round!");
			System.out.println("Next round!");
			}
		else if (choice1 == 2 && choice2 == 2) {
			System.out.println("Both players chose Paper. It's a tie!");
			game--;
			System.out.println("Rematch time!");
		}
		else if (choice1 == 2 && choice2 == 3) {
			System.out.println("Player 1 chose Paper and Player 2 chose Scissors. Player 2 wins this round!");
			System.out.println("Next round!");
			}
		else if (choice1 == 3 && choice2 == 1) {
			System.out.println("Player 1 chose Scissors and Player 2 chose Rock. Player 2 wins this round!");
				System.out.println("Next round!");
			}
		else if (choice1 == 3 && choice2 == 2) {
			System.out.println("Player 1 chose Scissors and Player 2 chose Paper. Player 1 wins this round!");
				System.out.println("Next round!");
			}
		else if (choice1 == 3 && choice2 == 3) {
			System.out.println("Both players chose Scissors. It's a tie!");
			game--;
			System.out.println("Rematch time!");
			}
		}
	}
}
	

	



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	}

}

