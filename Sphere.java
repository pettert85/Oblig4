
public class Sphere extends Circle {
	
	//constructors
	protected Sphere(){
		super();
		}

	protected Sphere(double r){
		super(r);
		}

	protected Sphere(double r, double t){
		super(r, t);
		}


	//Methods

	//finner kulas indre volum
	protected double findVolume(){
		double innerRadius = getRadius() - getThickness();
		return (4 / 3) * Math.PI * Math.pow( innerRadius, 3 );
	}

	//finner kulas overflateareal
	protected double findSurfacearea(){
		return 4 * Math.PI * Math.pow( getRadius(), 2 );
	}
	
	//finder vekten av kulas tykkelse
	protected double findWeight(){
		double radius = getRadius();
		return getIronWeight() * ( (4 / 3) * Math.PI * Math.pow( radius, 3 ) - findVolume() );
	}

} //Sphere