Lab18 
//homework
=====
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
public class Testprogram {

  public static void main(String args[]) {

		System.out.println(Dice.Roll_1_Dice());
		System.out.println(Dice.Roll_1_Dice());
		System.out.println(Dice.Roll_1_Dice());

		Dice Object = new Dice();
		System.out.println(Object.RollDice(2, 6));
		System.out.println(Object.RollDice(2, 6));
		System.out.println(Object.RollDice(2, 6));

		System.out.println("static dice count is\t" + Dice.RollCount());
		System.out.println("public dice count is\t" + Object.RollCount2());

	}
}
