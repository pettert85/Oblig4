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
		double tykkelse;

		
		System.out.print("Tast inn radius i dm: ");
		radius = input.nextDouble();

		System.out.print("Tast inn Tykkelse: ");
		tykkelse = input.nextDouble();
		
		Sphere sylinder = new Sphere(radius,tykkelse);

		System.out.println("Tyngden p� kula er" + Sphere.findweight() );





  	}
}

