public abstract class Circle extends GeometricObject { 
	
	/*må være abstrakt ellers må alle abstrakte metoder fra GeometricObjects implementeres
	  Vi behøver vel strengt talt ikke volum og vekt av bare en sirkel :)

	  en default constructor og en som setter radius + nødvendige metoder for findArea, FindCircumference
	  og getRadius og setRadius
																										*/ 
	
	private static double radius;
	
	//constructors
	public Circle() {
		radius = 0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}


	//metoder
	public static double findAreaOut() {
		return (radius * radius) * Math.PI;
	}
	
	public static double findAreaInner(double t) {
		double NewRadius = radius-t;
		return  (NewRadius*NewRadius)* Math.PI;
		
	}

	public  double findCircumference() {
		return (2 * Math.PI) * radius;
	}

	public  double findArea() {
		return Math.PI * (radius * radius);
	}


	public static double getRadius() {
		return radius;
	}

	public static void setRadius(double r) {

		radius = r;
	}
	
	
	
				
} //Circle
