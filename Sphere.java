
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
	protected double findVolume(){
		double innerRadius = getRadius() - getThickness();
		return (4 / 3) * Math.PI * Math.pow( innerRadius, 3 );
	}

	protected double findSurfacearea(){
		return 4 * Math.PI * Math.pow( getRadius(), 2 );
	}
	
	protected double findWeight(){
		double radius = getRadius();
		return getIronWeight() * ( (4 / 3) * Math.PI * Math.pow( radius, 3 ) - findVolume() );
	}

} //Sphere