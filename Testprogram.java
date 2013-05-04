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
