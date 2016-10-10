/*
Opretter her et geometrisk objekt kalt sirkel som benytter seg av klassen Cylinder fra den kan
vi oprette objekter -  klassen Cylinder arver også Circle sine egenskaper

*/


import java.util.Scanner;

public class Program{

	public static void main (String[] args){
		double radius;
		double tykkelse,height;
		
				Scanner input = new Scanner(System.in);
		int figure;
//Select figure
		System.out.print("Select a figure: \n Sphere = 1 \n Cylinder = 2 \n Cone = 3 \n Box = 4 \n Prism = 5 \n");
			do{ 
				figure = input.nextInt();
			
				if (figure<1 || figure>5){
					System.out.println("You can only select a defined shape");
					}
				
			}while(figure<1 || figure>5);
		


		//Objekt sirkel
		GeometricObject sirkel = new Cylinder(); // denne er litt merkelig men eneste måten jeg har fått det til.


		System.out.print("Tast inn radius: ");
		radius = input.nextDouble();

		System.out.print("Tast inn Tykkelse: ");
		tykkelse = input.nextDouble();

		System.out.print("Tast inn høyde: ");
		height = input.nextDouble();



		//setter radius / tykkelse
		Cylinder.setRadius(radius);
		GeometricObject.setThickness(tykkelse);

		System.out.println ("\nradiusen er: " + Cylinder.getRadius() );
		System.out.println("Tykkelsen er: " + GeometricObject.getThickness() );
		System.out.println("Jern veier: " + GeometricObject.getIronWeight() + " kg/dm^3" );

		System.out.println("\nSirkelen sin omkrets er " + sirkel.findCircumference() );
		System.out.println("Sirkelen sitt areal er " +  sirkel.findArea() );


		System.out.println("\nKula:");


		//opretter objekt kule
		GeometricObject kule = new Sphere(radius, tykkelse);

		System.out.println("kulas indre volum er: " + kule.findVolume() );
		System.out.println("kulas overflateareal er: " + kule.findSurfaceArea() );
		System.out.println("Tyngden pa kula er: " + kule.findWeight() );


		//opretter objekt sylinder

	
		

		GeometricObject sylinder = new Cylinder(radius, tykkelse , height);
/*
		System.out.println("sylinderens indre volum er: " + sylinder.findVolume() );
		System.out.println("sylinderens overflateareal er: " + sylinder.findSurfaceArea() );
		System.out.println("Tyngden til sylinderen er: " + sylinder.findWeight() );

*/
		System.out.print( sylinder.toString() );




  	}
}

