/*
Denne arver fra Circle og definerer derfor alle abstrakte metoder i Geometricobject
dermed behøver ikke denne være abstrakt, vi kan opprette objekter gjennom denne

*/

public class Cylinder extends Circle { 

	private static double height;

	//constructors
	public Cylinder(){
		super();
		height = 0;
	}

	public Cylinder(double r, double h, double t){
		super(r, t);
		height = h;
	}

	public static double getHeight(){
		return height;
	} //getHeight

	public static void setHeight(double h){
		height = h;
	} //setHeight


} //Cylinder