package liste;

import java.util.ArrayList;
import java.util.List;

public class GlavnaListe {

	public static void main(String[] args) {
		
		String ime = "Stevo";
		int god = 1987;
		
		List lista = new ArrayList();
		
		// dodavanje elemenata u listu
		
		lista.add(ime);
		lista.add(god);
		lista.add(3.14);
		lista.add(false);
		lista.add("Stevo");
		
		// "hvatanje" elemenata liste
		
		System.out.println("Treci element liste je " + lista.get(2));
		
		double x = (double)lista.get(2);
		String y = (String)lista.get(4);
		System.out.println(x);
		System.out.println(y);
		
		// genericke liste
		
		List<String> imena = new ArrayList<String>();
		
		imena.add("Pera");
		imena.add("Mika");
		imena.add("Zika");
		imena.add("Steva");
		
		imena.remove(0);// uklanjami element iz liste
		
		//prolaz kroz listu
		
		for (int i = 0; i<imena.size(); i++){
			String imePolaznika = imena.get(i);
			System.out.println("Ime polaznika je " + imePolaznika + ";");
		}
		
		
		
		String polaznik = (String) imena.get(1);
		System.out.println(polaznik);
		
		//for each
		
		for(String imePolaznika: imena) {
			System.out.println(imePolaznika);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
