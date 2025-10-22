import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Fighter f1 = new Fighter("A", 1, 1, 1, 1);
				
		Fighter[] allFighters = new Fighter[3];
		
		for(int i=0; i<allFighters.length; i++) {
			System.out.println("Unesi ime karaktera broj: " +(i+1) +".");
			input.nextLine();
			System.out.println("Unesi snagu karaktera: ");
			int strength = input.nextInt();
			System.out.println("Unesi brzinu karatera: ");
			int speed = input.nextInt();
			System.out.println("Unesi defanzivu karaktera: ");
			int defence = input.nextInt();
			int health = 100;
			String name = input.nextLine();
			allFighters[i] = new Fighter(name, strength, speed, defence, health);
		}
		
		for (int i = 0; i < allFighters.length; i++) {
			System.out.println(allFighters[i].toString());
		}
	}

	
}
