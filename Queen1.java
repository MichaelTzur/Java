import java.util.Arrays;

public class Queen1 {

	public static void main(String[] args) {

		boolean[] validCandidate = new boolean[100];
		Arrays.fill(validCandidate, true);

		int disqualified = 0, counter = 0, strikeCounter = 0;

		while (disqualified < validCandidate.length - 1) {
			int candidate = counter % validCandidate.length;

			if (validCandidate[candidate]) {
				strikeCounter++;
			}
			if (strikeCounter == 7) {
				validCandidate[candidate] = false;
				disqualified++;
				strikeCounter = 0;
			}
			counter++;
		}
		int candidate = 0;

		while (!validCandidate[candidate]) {
			candidate++;
		}
		System.out.println(candidate);
	}
}
