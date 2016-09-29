class PanteMaskin {
	
	static int flaskeTabell[] = new int [5] ;

	public static void flaskeRegistrering(int flaskeType){
	
		switch (flaskeType){

			case 1: 
				flaskeTabell[0] += 1;
			break;

			case 2:
				flaskeTabell[1] += 1;
			break;

			case 3:
				flaskeTabell[2] += 1;
			break;

			case 4:
				flaskeTabell[3] += 1;
			break;

			case 5:
				flaskeTabell[4] += 1;
			break;

			default:
				flaskeTabell[5] += 1;
			break;


		}
	}

	public static void utskrift() {
		int sum = 0;
		for (int i = 0; i < flaskeTabell.length; i++){
			if (i == 0 || i == 1) {
				System.out.println("Antall flasker av type " + (i+1) + ": " + flaskeTabell[i] + " gir kr " + flaskeTabell[i] * 1 );
				sum = flaskeTabell[i] * 1;
			}

			if (i == 2 || i == 3 ) {
				System.out.println("Antall flasker av type " + (i+1) + ": " + flaskeTabell[i] + " gir kr " + flaskeTabell[i] * 2 );
				sum = sum + flaskeTabell[i] * 2;
			}

			if (i >= 4) {
				System.out.println("Antall flasker av type " + (i+1) + ": " + flaskeTabell[i] );
			}

	}

	System.out.println("---------------------------------------");
	System.out.println("Totalt kr: " + sum);

		}
}