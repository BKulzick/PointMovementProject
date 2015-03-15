import java.util.Scanner;


public class PointMovementGame {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Use the words north, south, east, and west to move around.");

		while (true) {

			Locations.locationCheck(Movement.location);
			System.out.println("What direction do you want to go?");
			String choice = input.nextLine();
			choice.toLowerCase();
			switch (choice) {

			case "north":
				if (Locations.wallCheck('n', Movement.location) == true) {
					System.out.println("You went north!");
					Movement.changeYLocation(1, Movement.location);
					break;
				}
				break;

			case "south":
				if (Locations.wallCheck('s', Movement.location) == true) {
					System.out.println("You went south!");
					Movement.changeYLocation(-1, Movement.location);
					break;
				}
				break;
			case "east":
				if (Locations.wallCheck('e', Movement.location) == true) {
					System.out.println("You went east!");
					Movement.changeXLocation(1, Movement.location);
					break;
				}
				break;
			case "west":
				if (Locations.wallCheck('w', Movement.location) == true) {
					System.out.println("You went west!");
					Movement.changeXLocation(-1, Movement.location);
					break;
				}
				break;
			default:
				System.out.println("I don't understand that...");

			}

			
		}

	}

}


