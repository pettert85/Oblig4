
public class Sphere extends Circle {
	private static double tykkelse; //Greier ikke � endre variabelen (Static)
	
	//constructors
	public Sphere(){
		
		super();
		double tykkelse = 1;
		}
	public Sphere(double r, double t){
		super(r);
		double tykkelse = t;
		}
	
	
	//Metoder
	  static double findVoulumout(){ 
		return 4*findAreaOut();
		
	}
	  static double findVoulumInner(){
		
		return 4*findAreaInner(tykkelse); //F�r ikke sendt inn en verdi av tykkelse
		
	}
	   static double findweight(){
		  return ( findVoulumout() - findVoulumInner() ) * getIronWeight();
		  
	  }
	  
	  
	  //M� ha disse for at den skal kj�re
	  
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double findVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double findSurfacearea() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double findWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}
