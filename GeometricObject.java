public abstract class  GeometricObject{

	//constructors
	Rectangle(){

	}

	//Variables/Constants
	private double thickness = 0;
	private static final double IRON_WEIGHT = 7.8; //kg/dm^3

	//Methods
	abstract void  findArea();

	abstract void findVolume();

	abstract double findCircumference();

	abstract void findSurfacearea();

	abstract void findWeight();
  
	//getter/setters
	double getIronWeight(){
		return IRON_WEIGHT;
	} //getIronWeight

	 double getThickness(){
		return thickness;
	} //getThickness

	void setThickness(double x){
		thickness = x;
	} //setThickness

}
