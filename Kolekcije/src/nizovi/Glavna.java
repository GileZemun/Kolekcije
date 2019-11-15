package nizovi;

public class Glavna {

	public static void main(String[] args) {
		
		int [] array = new int [5];
		
		//1. nacin
		
		array[0] = 53;
		array[1] = 29;
		array[2] = 13;
		/*
		 * array[3] = 62; array[4] = 69;
		 */
		
		System.out.println("Treci clan arraya je " + array[4]);
		
		//2. nacin
		
		int [] niz = {11,59,63,55,887,99};
		
		System.out.println("Treci clan niza je " + niz[2]);
		
		// niz Stringova
		
		String [] imena = {"Pera", "Steva", "Mika", "Zika"};
		
		System.out.println("Ovde ima " + imena.length + " imena");
		
		//ispis uz pomoc for petlje
		
		for(int i = 0; i < imena.length; i++) {
			System.out.println(imena[i]);
		}
		
		//ispis uz pomoc while petlje
		
		int i = 0;
		while(i<imena.length) {
			System.out.println(imena[i]);
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
