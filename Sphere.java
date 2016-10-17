/*
Ikke abstrakt, definerer alle metoder i GeometricObjects noen 
blir definert i Circle klassen
*/

public class Sphere extends Circle {

	//constructors
	protected Sphere(){
		super();
	}

	protected Sphere(double r, double t){
		super(r, t);
	}


	//Methods

	//finner kulas volum
	protected double findVolume(){
		return (4.0 / 3.0) * Math.PI * Math.pow( getRadius(), 3 );
	}

	//finner kulas indre volum
	protected double findInnerVolume(){
		double innerRadius = getRadius() - getThickness();
		return (4.0 / 3.0) * Math.PI * Math.pow( innerRadius, 3 );
	}

	//finner kulas overflateareal
	protected double findSurfaceArea(){
		return 4 * Math.PI * Math.pow( getRadius(), 2 );
	}

	//finder vekten av volumet til tykkelsen
	protected double findWeight(){
		return getIronWeight() * ( findVolume() - findInnerVolume() );
	}

	public String toString(){

		return "\nSphere:\n"
		+ super.toString() 
		+ "\n"
		+ "\nThe Spheres volume is: " + String.format("%.2f", findVolume() ) + " dm^3." 
		+ "\nThe Spheres surfacearea is: " + String.format("%.2f", findSurfaceArea() )  + " dm^2."
		+ "\nThe Spheres weight is: " + String.format("%.2f", findWeight() ) + " kg.\n"; 
	}

} //Sphere
