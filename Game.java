import java.util.Random;

import javax.swing.JOptionPane;

public class Game {

	public static void main(String[] args) {
		int difficultyLevel = getValidDifficultyLevel();
		int maxAmountOfGuesses = getAmountOfGuessesByDifficultyLevel(difficultyLevel);
		int computerNumber = generateValidComputerNumber();
		
		int currentRound = 1;
		boolean isUserWon = false;

		while(currentRound <= maxAmountOfGuesses && !isUserWon) {
			int userGuess = getValidUserGuess();
			int amountOfHits = calcAmountOfHits(computerNumber, userGuess);
			
			if (amountOfHits == 4) {
				isUserWon = true;
			}
			else {
				int amountOfNearHits = calcAmountOfNearHits(computerNumber, userGuess);
				System.out.println("Round:" + currentRound + " Guess:" + userGuess + " Hits:" + amountOfHits +
									" Near hits:" + amountOfNearHits);
				currentRound++;
			}
		}
		if (isUserWon) {
			JOptionPane.showMessageDialog(null, "Yay ! you won !!");
		}
		else {
			JOptionPane.showMessageDialog(null, "It's ok, high tech isn't for everyone, consider Lak + Gel num =" + computerNumber);
		}
	}

	private static int calcAmountOfNearHits(int computerNumber, int userGuess) {

		boolean[] computerNumDigitsArray = new boolean[10];
		boolean[] userNumDigitsArray = new boolean[10];
		int amountOfHits = calcAmountOfHits(computerNumber, userGuess);
		int counter = 0, amountOfNearHits;

		while (computerNumber != 0) {
			int computerNumberRightDigit = computerNumber % 10;
			computerNumDigitsArray[computerNumberRightDigit] = true;
			computerNumber /= 10;
		}
		while (userGuess != 0) {
			int userNumRightDigit = userGuess % 10;
			userNumDigitsArray[userNumRightDigit] = true;
			userGuess /= 10;
		}
		for (int i = 0; i < 10; i++) {
			if (computerNumDigitsArray[i] && userNumDigitsArray[i]) {
				counter++;
			}
		}
		amountOfNearHits = counter - amountOfHits;
		return amountOfNearHits;
	}

	private static int calcAmountOfHits(int computerNumber, int userGuess) {

		int counter = 0;

		while (computerNumber != 0) {
			if (computerNumber % 10 == userGuess % 10) {
				counter++;
			}
			computerNumber = computerNumber / 10;
			userGuess = userGuess / 10;
		}
		return counter;
	}

	private static int getValidUserGuess() {

		String strNum = JOptionPane.showInputDialog("enter number with 4 different digits");
		int num = Integer.parseInt(strNum);

		while(!isDigitsUnique(num) || num < 1000 || num > 9999) {
			strNum = JOptionPane.showInputDialog("invalid number. enter number with 4 different digits");
			num = Integer.parseInt(strNum);
		}
		return num;
	}

	private static boolean isDigitsUnique(int num) {

		int[] arr = new int[10];
		boolean uniqueDigits = true;

		while (num != 0) {
			int rightDigit = num % 10;
			arr[rightDigit]++;
			num = num / 10;
		}
		for (int i = 0; i < 10; i++) {
			if (arr[i] > 1) {
				uniqueDigits = false;
				return uniqueDigits;
			}
		}
		return uniqueDigits;
	}

	private static int generateValidComputerNumber() {
		Random rnd = new Random();
		int computerNumber = rnd.nextInt(8854)+1023;
		
		while(!isDigitsUnique(computerNumber)) {
			computerNumber = rnd.nextInt(9999); 
		}
		return computerNumber;
	}

	private static int getAmountOfGuessesByDifficultyLevel(int difficultyLevel) {
		if (difficultyLevel == 1) {
			return 12;
		}
		if (difficultyLevel == 2) {
			return 9;
		}
		return 7;
	}

	private static int getValidDifficultyLevel() {
		String strDifficultyLevel = JOptionPane.showInputDialog("Please choose difficulty level:\n"+
																"1.Easy - 12 guesses\n"+
																"2.Medium - 9 guesses\n"+
																"3.Hard - 7 guesses");
		int difficultyLevel = Integer.parseInt(strDifficultyLevel);
		
		while(difficultyLevel<1 || difficultyLevel>3) {
			strDifficultyLevel = JOptionPane.showInputDialog("Invalid number, should be 1-3\n"
					+ "Please choose difficulty level : \n"+
					"1.Easy - 12 guesses\n"+
					"2.Medium - 9 guesses\n"+
					"3.Hard - 7 guesses");
			difficultyLevel = Integer.parseInt(strDifficultyLevel);
		}
		return difficultyLevel;
	}
}
