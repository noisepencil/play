package play;

import java.util.Scanner;

public class Play {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Initialize variables and CONSTANTS

		Car explorer = new Car();
		explorer.setColor("Grey");

		Truck bronco = new Truck();
		bronco.setColor("Blue");
		bronco.setnumberOfSpeakers(4);

		System.out.println("-----------------");
		System.out.println(bronco.getColor());
		System.out.println("-----------------");

		input.close();
	}
}
