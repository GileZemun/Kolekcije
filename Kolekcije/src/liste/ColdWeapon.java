package liste;

public class ColdWeapon implements Weapon {

	
	private final String name = "Zno";
	private final int damage = 10;
	
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
