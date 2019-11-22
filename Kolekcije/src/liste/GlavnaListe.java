package liste;

import java.util.ArrayList;
import java.util.List;

public class GlavnaListe {

	public static void main(String[] args) {
		
		/*
		 * String ime = "Stevo"; 
		 * int god = 1987;
		 * 
		 * List lista = new ArrayList();
		 * 
		 * // dodavanje elemenata u listu
		 * 
		 * lista.add(ime); lista.add(god); lista.add(3.14); lista.add(false);
		 * lista.add("Stevo");
		 * 
		 * // "hvatanje" elemenata liste
		 * 
		 * System.out.println("Treci element liste je " + lista.get(2));
		 * 
		 * double x = (double)lista.get(2); String y = (String)lista.get(4);
		 * System.out.println(x); System.out.println(y);
		 * 
		 * // genericke liste
		 * 
		 * List<String> imena = new ArrayList<String>();
		 * 
		 * imena.add("Pera"); imena.add("Mika"); imena.add("Zika"); imena.add("Steva");
		 * 
		 * imena.remove(0);// uklanjami element iz liste
		 * 
		 * //prolaz kroz listu
		 * 
		 * for (int i = 0; i<imena.size(); i++){ String imePolaznika = imena.get(i);
		 * System.out.println("Ime polaznika je " + imePolaznika + ";"); }
		 * 
		 * 
		 * 
		 * String polaznik = (String) imena.get(1); System.out.println(polaznik);
		 * 
		 * //for each
		 * 
		 * for(String imePolaznika: imena) { System.out.println(imePolaznika); }
		 */
		
		List <Integer> brojevi = new ArrayList <Integer>();
		
		Soldier soldier1 = new Soldier();
			soldier1.setName("Visnja killer");
			soldier1.setHealth(100);
			soldier1.setMoney(16000);
			soldier1.setTeam("Terori");
			
		Soldier soldier2 = new Soldier();
			soldier2.setName("JankoBrt");
			soldier2.setHealth(100);
			soldier2.setMoney(16000);
			soldier2.setTeam("Terori");
		
		Soldier soldier3 = new Soldier();
			soldier3.setName("MirkoSrc");
			soldier3.setHealth(100);
			soldier3.setMoney(16000);
			soldier3.setTeam("Terori");
		
		Soldier soldier4 = new Soldier();
			soldier4.setName("Mirc");
			soldier4.setHealth(100);
			soldier4.setMoney(16000);
			soldier4.setTeam("Kanteri");
		
		Soldier soldier5 = new Soldier();
			soldier5.setName("Ovan");
			soldier5.setHealth(100);
			soldier5.setMoney(16000);
			soldier5.setTeam("Kanteri");
		
		Soldier soldier6 = new Soldier();
			soldier6.setName("Vortex");
			soldier6.setHealth(100);
			soldier6.setMoney(16000);
			soldier6.setTeam("Kanteri");
		
		List <Soldier> terori = new ArrayList<Soldier>();
			terori.add(soldier1);
			terori.add(soldier2);
			terori.add(soldier3);
			
		List <Soldier> kanteri = new ArrayList<Soldier>();
			kanteri.add(soldier4);
			kanteri.add(soldier5);
			kanteri.add(soldier6);
		
		System.out.println("Ekipa terora je: ");
		for (Soldier s: terori) {
			System.out.println(s.getName());
		}
		
		System.out.println(".................");
		
		System.out.println("Ekipa kantera je: ");
		for (Soldier s: kanteri) {
			System.out.println(s.getName());
		}
		
		Weapon firearm = new FireArm();
		Weapon knife = new ColdWeapon();
		
		List<Weapon> myWeapon = new ArrayList<Weapon>();
			myWeapon.add(knife);
			myWeapon.add(firearm);
		
		soldier3.setRanac(myWeapon);
		soldier3.getRanac().get(1).hit(soldier4);

	}

}
