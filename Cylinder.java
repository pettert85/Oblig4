public class Cylinder extends Circle { 

	private static double height;

	//constructors
	protected Cylinder(){
		super();
		height = 0;
	}

	protected Cylinder(double r, double h, double t){
		super(r, t);
		height = h;
	}


	//Methods
	
	//Areal av grunnflate * høyde
	protected double findVolume(){
		double innerradius = getRadius() - getThickness();
		double innerheight = getHeight() - 2 * getThickness();

		return Math.PI * Math.pow(innerradius, 2) * innerheight;
	}

	//areal av bunn/topp/vegg
	protected double findSurfacearea(){
		double radius = getRadius();
		double height = getHeight();

		return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
	}
	

	protected double findWeight(){
		double radius = getRadius();
		return getIronWeight() * ( (4 / 3) * Math.PI * Math.pow( radius, 3 ) - findVolume() );
	}


	//gettere/settere
	public static double getHeight(){
		return height;
	} //getHeight

	public static void setHeight(double h){
		height = h;
	} //setHeight


} //Cylinder