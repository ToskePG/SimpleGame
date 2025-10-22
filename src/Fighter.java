
public class Fighter {
	
	private String name;
	private int speed;
	private int strength;
	private int defence;
	private int health;
	
	public Fighter(String name, int speed, int strength, int defence, int health) {
		this.name = name;
		this.speed = speed;
		this.strength = strength;
		this.defence = defence;
		this.health = health;
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
	
	public void fighterDeath() {
		System.out.println("YOur char has died");
		this.setHealth(0);
		System.out.println(this.getHealth());
	}

	@Override
	public String toString() {
		return "Fighter [name=" + name + ", speed=" + speed + ", strength=" + strength + ", defence=" + defence
				+ ", health=" + health + "]";
	}
	
	
}
