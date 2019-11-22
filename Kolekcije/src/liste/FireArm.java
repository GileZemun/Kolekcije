package liste;

public class FireArm implements Weapon {

	private final String name = "Kalas";
	private final int damage = 50;
	
	public String getName() {
		return name;
	}

	public int getDamage() {
		return damage;
	}

	@Override
	public void hit(Soldier soldier) {
		int preostliHealth = soldier.getHealth() - this.damage;
		soldier.setHealth(preostliHealth);
		System.out.println(soldier.getName() + " sada ima " + preostliHealth);
		
	}
}
