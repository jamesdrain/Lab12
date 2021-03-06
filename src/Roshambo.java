import java.util.Scanner;

import java.util.Random;

public class Roshambo {

	public static void main(String[] args) {

		System.out.println("\nPlay Rock Paper Scissors with me!");
		Scanner scnr = new Scanner(System.in);

		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {

			int player = Roshambo.player();
			int cpu = Roshambo.cpu();

			if (player == -1) {

				System.out.println(

						"\nYou don't want to play? Come back soon!");

				System.exit(0);

			} else {

				System.out.printf("You chose %s! CPU chose %s! ",

						Roshambo.name(player), Roshambo.name(cpu));

				String result = "";

				if (player == cpu)

					result = "Its a draw!";

				else if (((player + 1 <= 2) ? player + 1 : 0) == cpu)

					result = "CPU wins!";

				else

					result = "You win!";

				System.out.printf("%s\nThanks for playing! \n\n", result);
				System.out.println("Want to go again? ");
				cont = scnr.nextLine();

			}
		}
		System.out.println("Ok, bye. ");
	}

	public static int player() {

		Scanner scnr = new Scanner(System.in);

		int answer = -1;

		System.out.print(

				"Choose one of the following:\n" +

						"    1: Scissors (cuts paper)\n" +

						"    2: Rock     (knocks scissors)\n" +

						"    3: Paper    (wraps rock)\n");

		try {

			answer = scnr.nextInt() - 1;

		} catch (java.util.InputMismatchException e) {

		}

		return (answer >= 0 && answer <= 2) ? answer : -1;

	}

	public static int cpu() {

		Random gen = new Random();

		return gen.nextInt(3);

	}

	public static String name(int answer) {

		String name = "";

		switch (answer) {

		case 0:
			name = "Scissors";
			break;

		case 1:
			name = "Rock";
			break;

		case 2:
			name = "Paper";
			break;

		}
		return name;

	}

}
