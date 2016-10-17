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

	//Volum av kjegle
	protected double findVolume(){
		return 	Math.PI * Math.pow(getRadius(), 2) * getHeight()/3;
	}

	//Indre volum av kjegle
	protected double findInnerVolume(){
		double x = (getHeight() * getThickness())/getRadius();
		double innerheight = Math.sqrt(Math.pow(x, 2)+Math.pow(getThickness(), 2));
		
		double innerradius = (innerheight *2*getRadius())/getHeight();
		
		return Math.PI * Math.pow(innerradius, 2) * innerheight / 3;
	}
	


	//areal av hele overflaten
	protected double findSurfaceArea(){

		return   Math.PI * Math.pow(getRadius(), 2) +  Math.PI * getRadius() *  Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getRadius(), 2));
	}

	//Vekt av kjegle
	protected double findWeight(){
	
		return ( (  findVolume()  - findInnerVolume() ) * getIronWeight()  );
	}


	//getters/setters
	public static double getHeight(){
		return height;
	} //getHeight

	public static void setHeight(double h){
		height = h;
	} //setHeight

	public String toString(){

		return "\nCone:\n"
			 + super.toString() 
			 + " Height: " + height + "dm.  "
			 + "\n"
			 + "\nThe Cone volume is: " + String.format("%.2f", findVolume() ) + " dm^3." 
			 + "\nThe Cone surfacearea is: " + String.format("%.2f", findSurfaceArea() )  + " dm^2."
			 + "\nThe Cone weight is: " + String.format("%.2f", findWeight() ) + " kg.\n"; 
	}


	} //Cylinder
