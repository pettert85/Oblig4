import java.util.Scanner;

public class Program{

	public static void main (String[] args){

	Scanner input = new Scanner(System.in);

    String tekst = "Du liker ";
    String minFavoritt ="hamburger";

    System.out.print("Hva er din favorittmiddag? ");
    String middag = input.nextLine();

    String sum = tekst.concat(middag);

    System.out.println(sum);
    System.out.println("Lengden av strengen er: " + sum.length() );
    int like = middag.compareTo(minFavoritt);

    if (like == 0) {
    	System.out.println("Vi har samme smak, jeg liker nemlig også " + middag);
    }

    else{
    	System.out.println("Vi liker forskjellige middager. jeg liker " + minFavoritt + " og du liker " +
    						middag);
    }

  	}
}

