public class Dice {
  static int total = 0;
	int ptotal = 0;

	public int RollDice(int NumOfDice, int sidesofdice) {
		ptotal += NumOfDice;

		// number of dices

		return (1 * NumOfDice + (int) (Math.random() * sidesofdice * NumOfDice));
	}

	static int Roll_1_Dice() {
		total++;
		return 1 + (int) (Math.random() * 6);

	}

	static int RollCount() {

		return total;
	}

	public int RollCount2() {
		return ptotal;

	}
}
