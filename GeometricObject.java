//En abstrakt superklasse som påser at vi implementerer nødvendige metoder

public abstract class  GeometricObject{

	//Tykkelse og vekt av jern er felles for alle underklasser
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

	protected abstract double findInnerVolume();


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

//Tostring
public String toString(){

		return "Thickness: " + thickness + "dm.  ";
	}

} // GeometricObject