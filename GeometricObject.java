//har flyttet flere metoder og constructorer hit da flere subklasser kommer til og benytte seg av
//samme metoder/ constructorer - slik at de kun behøves her.


public abstract class  GeometricObject{


	private static double thickness;
	private static final double IRON_WEIGHT = 7.8; //kg/dm^3

	//constructors
	protected GeometricObject(){
		thickness = 0;
	}

	protected GeometricObject(double t) {
		thickness = t;

	}

	//Abstract Methods
	protected abstract double findArea();

	protected abstract double findVolume();

	protected abstract double findCircumference();

	protected abstract double findSurfaceArea();

	protected abstract double findWeight();


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

public String toString(){

		return "Thickness: " + thickness + "dm.  ";
	}

} // GeometricObject


