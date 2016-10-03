//har flyttet flere metoder og constructorer hit da flere subklasser kommer til og benytte seg av
//samme metoder/ constructorer - slik at de kun behøves her.


public abstract class  GeometricObject{


	private static double thickness,height,radius,width;
	private static final double IRON_WEIGHT = 7.8; //kg/dm^3

	//constructors
	protected GeometricObject(){
		radius = 0;
		thickness = 0;
		height = 0;
		width = 0;
	}

	protected GeometricObject(double r, double t) {
		radius = r;
		thickness = t;

	}

	protected GeometricObject(double r, double t, double h) {
		radius = r;
		thickness = t;
		height = h;
	}


	//Abstract Methods
	public abstract double findArea();

	public abstract double findVolume();

	public abstract double findCircumference();

	public abstract double findSurfacearea();

	public abstract double findWeight();

	
	//Getter/setters
	public static double getIronWeight(){
		return IRON_WEIGHT;
	} //getIronWeight

	public static double getThickness(){
		return thickness;
	} //getThickness

	public static void setThickness(double t){
		thickness = t;
	} //setThickness

	public static double getRadius(){
		return radius;
	} //getRadius

	public static void setRadius(double r){
		radius = r;
	} //setRadius

	public static double getHeight(){
		return height;
	} //getHeight

	public static void setHeight(double h){
		height = h;
	} //setHeight

}
