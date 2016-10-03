/*
Denne arver fra Circle og definerer derfor alle abstrakte metoder i Geometricobject
dermed behøver ikke denne være abstrakt, vi kan opprette objekter gjennom denne

*/

public class Cylinder extends Circle { 

	double fiktiv;

	//constructors
	public Cylinder(){
		super();
	}

	public Cylinder(double r, double h, double t){
		super(r, t, h);
	}

	public double findVolume(){
		return fiktiv;
	}

	public double findSurfacearea(){
		return fiktiv;
	}
	
	public double findWeight(){
		return fiktiv;
	}

} //Cylinder