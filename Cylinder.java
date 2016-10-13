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

		return Math.PI * Math.pow(getRadius(), 2) * getHeight();
	}

	protected double findInnerVolume(){
		
		double innerradius = getRadius() - getThickness();
		double innerheight = getHeight() - 2 * getThickness();

		return Math.PI * Math.pow(innerradius, 2) * innerheight;
	}

	//areal av bunn/topp/vegg
	protected double findSurfaceArea(){

		return 2 * Math.PI * Math.pow(getRadius(), 2) + 2 * Math.PI * getRadius() * getHeight();
	}


	protected double findWeight(){
	
		return ( ( findVolume()  - findInnerVolume() ) * getIronWeight()  );
	}


	//gettere/settere
	public static double getHeight(){
		return height;
	} //getHeight

	public static void setHeight(double h){
		height = h;
	} //setHeight

	public String toString(){

		return "\nCylinder:\n"
			 + super.toString() 
			 + "Height: " + height + "dm.  "
			 + "\n"
			 + "\nThe cylinders Inner volume is: " + String.format("%.2f", findVolume() ) + "dm/3" 
			 + "\nThe cylinders surfacearea is: " + String.format("%.2f", findSurfaceArea() )  + "dm/2"
			 + "\nThe cylinders weight is: " + String.format("%.2f", findWeight() ) + "kg.\n"; 
	}


} //Cylinder