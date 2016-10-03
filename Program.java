/*
Opretter her et geometrisk objekt kalt sirkel som benytter seg av klassen Cylinder fra den kan
vi oprette objekter -  klassen Cylinder arver også Circle sine egenskaper

*/


import java.util.Scanner;

public class Program{

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);
		GeometricObject sirkel = new Cylinder(); // denne er litt merkelig men eneste måten jeg har fått det til.
		double radius;

		
		System.out.print("Tast inn radius: ");
		radius = input.nextDouble();
		
		Cylinder.setRadius(radius);

		System.out.println("Sirkelen sin omkrets er " + sirkel.findCircumference() );
		System.out.println("Sirkelen sitt areal er " + sirkel.findArea() );

		System.out.println ( Cylinder.getRadius() );




  	}
}

