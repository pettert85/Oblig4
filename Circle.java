/*
Definert som abstract metode da den ikke definerer alle metoder i
GeometricObjects - kan ikke oprette objekter fra denne klassen.

*/

public abstract class Circle extends GeometricObject { 
	private static double radius;
	
	//constructors
	protected Circle(){
		
		//arver superklassens default constructor + radius
		super();
		radius = 1;
	}

	protected Circle(double r, double t){
		super(t);
		radius = r;
	} 


	//Methods
	protected  double findCircumference() {
		return (2 * Math.PI) * radius;
	}

	protected  double findArea() {
		return Math.PI * ( Math.pow(radius, 2) );
	}


	//getters/setters
	public static double getRadius(){
		return radius;
	} //getRadius

	public static void setRadius(double r){
		radius = r;
	} //setRadius

	public String toString(){

		return "Radius: " + radius + "dm.  " + super.toString();
	}
				
} //Circle