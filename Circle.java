//behøver bare metoder som tilhører en sirkel

public abstract class Circle extends GeometricObject { 
	private static double radius;
	
	protected Circle(){
		
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


	//getter/setters
	public static double getRadius(){
		return radius;
	} //getRadius

	public static void setRadius(double r){
		radius = r;
	} //setRadius

	public String toString(){

		return "radius is: " + radius + "dm, " + super.toString();
	}
				
} //Circle