public abstract class  GeometricObject{


	private static double thickness = 0;
	private static final double IRON_WEIGHT = 7.8; //kg/dm^3

	//constructors
	protected GeometricObject(){
	}



	//Abstract Methods
	public abstract double findArea();

	public abstract double findVolume();

	public abstract double findCircumference();

	public abstract double findSurfacearea();

	public abstract double findWeight();

	
	//methods
	public static double getIronWeight(){
		return IRON_WEIGHT;
	} //getIronWeight

	public static double getThickness(){
		return thickness;
	} //getThickness

	public static void setThickness(double x){
		thickness = x;
	} //setThickness

}
