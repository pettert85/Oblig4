
public class Cone extends Circle {

	private static double height;

	//constructors
	protected Cone(){
		super();
		height = 1;
	}

	protected Cone(double r, double t, double h){
		super(r, t);
		height = h;
	}


	//Methods

	//Areal av grunnflate * høyde
	protected double findinnerVolume(){
		double innerradius = getRadius() - getThickness();
		double innerheight = getHeight() - 2 * getThickness();

		return Math.PI * Math.pow(innerradius, 2) * innerheight / 3;
	}
	protected double findVolume(){
		
		return 	Math.PI * Math.pow(getRadius(), 2) * getHeight()/3;
	}

	//areal av bunn/topp/vegg
	protected double findSurfaceArea(){

		return   Math.PI * Math.pow(getRadius(), 2) +  Math.PI * getRadius() *  Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getRadius(), 2));
	}


	protected double findWeight(){
	
		return ( (  findVolume()  - findVolume() ) * getIronWeight()  );
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
			 + " Height: " + height + "dm.  "
			 + "\n"
			 + "\nThe Cone volume is: " + String.format("%.2f", findVolume() ) + "dm3" 
			 + "\nThe Cone surfacearea is: " + String.format("%.2f", findSurfaceArea() )  + "dm/2"
			 + "\nThe Cone weight is: " + String.format("%.2f", findWeight() ) + "kg.\n"; 
	}


	} //Cylinder

