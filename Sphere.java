
public class Sphere extends Circle {

	//constructors
	protected Sphere(){
		super();
		}

	protected Sphere(double r, double t){
		super(r, t);
		}


	//Methods

	//finner kulas indre volum
	protected double findVolume(){
		double innerRadius = getRadius() - getThickness();
		return (4.0 / 3.0) * Math.PI * Math.pow( innerRadius, 3 );
	}

	//finner kulas overflateareal
	protected double findSurfaceArea(){
		return 4 * Math.PI * Math.pow( getRadius(), 2 );
	}

	//finder vekten av kulas tykkelse
	protected double findWeight(){
		double radius = getRadius();
		return getIronWeight() * ( (4.0 / 3.0) * Math.PI * Math.pow( radius, 3 ) - findVolume() );
	}

public String toString(){

		return super.toString() + ", " + "the surfacearea is " + findSurfaceArea() + 
								" DM/2, and the weight is " + findWeight() + "kg.";
	}

} //Sphere