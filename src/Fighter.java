
public class Fighter {
	
	private String name;
	private int speed;
	private int strength;
	private int defence;
	private int health;
	private int numberOfCredits;
	private boolean inGuard;
	private boolean inAir;
	
	public Fighter(String name, int speed, int strength, int defence, int health, int numberOfCredits, boolean inGuard, boolean inAir) {
		this.name = name;
		this.speed = speed;
		this.strength = strength;
		this.defence = defence;
		this.health = health;
		this.numberOfCredits = numberOfCredits;
		this.inGuard = inGuard;
		this.inAir = inAir;
	}
	
	public Fighter(String name, int speed, int strength, int defence, int health, int numberOfCredits, boolean inGuard) {
		this.name = name;
		this.speed = speed;
		this.strength = strength;
		this.defence = defence;
		this.health = health;
		this.numberOfCredits = numberOfCredits;
		this.inGuard = inGuard;
	}
	
	public Fighter(String name, int speed, int strength, int defence, int health, int numberOfCredits) {
		this.name = name;
		this.speed = speed;
		this.strength = strength;
		this.defence = defence;
		this.health = health;
		this.numberOfCredits = numberOfCredits;
	}
	
	public Fighter(String name, int speed, int strength, int defence, int health) {
		this.name = name;
		this.speed = speed;
		this.strength = strength;
		this.defence = defence;
		this.health = health;
		this.inGuard = false;
	}
	
	public Fighter() {
		this.name = "";
		this.speed = 0;
		this.strength = 0;
		this.defence = 0;
		this.health = 0;
		this.numberOfCredits = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int restartHealth() {
		return 100;
	}
	
	public void printFigtherName() {
		System.out.println(this.getName());
	}
	
	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public boolean isInGuard() {
		return inGuard;
	}

	public void setInGuard(boolean inGuard) {
		this.inGuard = inGuard;
	}
	
	public boolean isInAir() {
		return inAir;
	}

	public void setInAir(boolean inAir) {
		this.inAir = inAir;
	}

	public void fighterDeath() {
		System.out.println("Char has died.");
		this.setHealth(0);
		// System.out.println(this.getHealth());
	}

	@Override
	public String toString() {
		return "Fighter [name=" + name + ", speed=" + speed + ", strength=" + strength + ", defence=" + defence
				+ ", health=" + health + "]";
	}
	
	public void moveRight() {
		System.out.println("Your char moved to the right. ");
	}
	
	public void moveLeft() {
		System.out.println("Your char moved to the left. ");
	}
	
	public void jump() {
		System.out.println("Your char jumped ");
		this.setInAir(true);
	}
	
	public void land() {
		System.out.println("Your char landed.");
		this.setInAir(false);
	}
	
	public void crouch() {
		System.out.println("You crouched");
	}
	
	public void getInGuard() {
		this.setInGuard(true);
	}
	
	public void leaveGuard() {
		this.setInGuard(false);
	}
	
	public int firstKick(Fighter opponent) {
		if(this.isInGuard()) {
			return 0;
		}
		if(opponent.isInGuard()) {
			System.out.println("Your opponent defended.");
			return 0;
		}else {
			System.out.println("You dealt small damage");
			return 10;
		}
	}
	
	public void calculateDamage(int damage, Fighter f1) {
		f1.setHealth(f1.getHealth()-damage);
		if(f1.getHealth()<1) {
			f1.fighterDeath();
		}
	}
}
