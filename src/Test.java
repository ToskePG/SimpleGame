import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of credits. For multiplayer option, enter at least 2 credits");
		
		int credits = input.nextInt();
		
		System.out.println("Choose your option: \n 1. Single player game \n 2. Multiplayer game");
		int selectOption = input.nextInt();
		while(selectOption!=1 && selectOption!=2) {
			System.out.println("Invalid Option. Try again ");
			selectOption = input.nextInt();
		}
		
		
		Fighter[] fighter_options = new Fighter[5];
		fighter_options[0] = new Fighter("Billy", 91, 90, 92, 100);
		fighter_options[1] = new Fighter("Jimmy", 90, 91, 92, 100);
		fighter_options[2] = new Fighter("Dalton", 92, 83, 79, 100);
		fighter_options[3] = new Fighter("Abobo", 99, 56, 89, 100);
		fighter_options[4] = new Fighter("Cheng Li", 82, 83, 91, 100);
		
		if(selectOption == 1) {
			System.out.println("Select your character to fight against the computer");
			System.out.println(" 1. Billy \n 2. Jimmy \n 3. Dalton \n 4. Abobo \n 5. Cheng LI");
			int fighter_selected = input.nextInt();
			while(fighter_selected < 1 || fighter_selected > 4) {
				System.out.println("Invalid Option. Try again ");
				fighter_selected = input.nextInt();
			}
			if(fighter_selected == 1) {
				System.out.println("Your first battle is about to start..... ");
				System.out.println("Billy is fighting Jimmy.");
				
				System.out.println("Commands: A - left \n D - right \n S - crouch \n W jump \n M - first kick");
				
				input.nextLine();
				String command = input.nextLine();
				
				System.out.println(command);
				while(
					    !command.equals("A") &&
					    !command.equals("S") &&
					    !command.equals("D") &&
					    !command.equals("W") &&
					    !command.equals("M")
					) {
					command = input.nextLine();
				}
				if(command == "A") {
					fighter_options[0].moveLeft();
				}
				else if(command == "D") {
					fighter_options[0].moveRight();
				}
				else if(command.equals("S")) {
					fighter_options[0].crouch();
				}
				else if(command.equals("W")) {
					fighter_options[0].jump();
				}
				else if(command.equals("M")) {
					System.out.println("LALA");
					fighter_options[0].firstKick(fighter_options[1]);
					if(!fighter_options[1].isInGuard()) {
						fighter_options[0].calculateDamage(10, fighter_options[1]);
						System.out.println(fighter_options[1].getHealth());
					}
				}
			}
		}
	}

}