//behøver bare metoder som tilhører en sirkel

public abstract class Circle extends GeometricObject { 
	
	public Circle(){
		
		super();
		}

	public Circle(double r, double t){
		super(r, t);
		} 

	public Circle(double r, double t, double h){
		super(r, t, h);
		} 


	//Methods
	public  double findCircumference() {
		return (2 * Math.PI) * getRadius();
	}

	public  double findArea() {
		return Math.PI * ( getRadius() * getRadius() );
	}
				
} //Circle
