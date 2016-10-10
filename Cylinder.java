public class Cylinder extends Circle {

	private static double height;

	//constructors
	protected Cylinder(){
		super();
		height = 1;
	}

	protected Cylinder(double r, double t, double h){
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
	protected double findSurfaceArea(){

		return 2 * Math.PI * Math.pow(getRadius(), 2) + 2 * Math.PI * getRadius() * getHeight();
	}


	protected double findWeight(){
	
		return ( ( Math.PI * Math.pow(getRadius(), 2) * height   - findVolume() ) * getIronWeight()  );
	}


	//gettere/settere
	public static double getHeight(){
		return height;
	} //getHeight

	public static void setHeight(double h){
		height = h;
	} //setHeight

	public String toString(){

		DecimalFormat df = new DecimalFormat("#.00");

		return "\nThe cylinders " + super.toString() 
			 + " and the height is: " + height + "dm\n"
			 + "The volume is: " + findVolume() + "dm/3" 
			 + "\nThe surfacearea is: " + findSurfaceArea()  + "dm/2"
			 + "\nAnd the weight is: " + findWeight() + "kg.\n";
	}


} //Cylinder