public abstract class  GeometricObject{

	double thickness = 0;
	private static final double IRON_WEIGHT = 7.8; //kg/dm^3

	void findArea() {
	} //findArea

	void findVolume(){
	} //findVolume

	void findCircumference(){
	} //findCircumference

	void findSurfacearea(){
	} //findSurfacearea

	void findWeight(){
	} //findWeight
  

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
