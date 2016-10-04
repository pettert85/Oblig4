//behøver bare metoder som tilhører en sirkel

public abstract class Circle extends GeometricObject { 
	private static double radius,thickness;
	
	protected Circle(){
		
		super();
		radius = 0;
		}

	protected Circle(double r){
		radius = r;
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
		return Math.PI * ( radius * radius );
	}


	//getter/setters
	public static double getRadius(){
		return radius;
	} //getRadius

	public static void setRadius(double r){
		radius = r;
	} //setRadius


				
} //Circle
