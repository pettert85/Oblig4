
public class Sphere extends Circle {
	private static double tykkelse; //Greier ikke å endre variabelen (Static)
	
	//constructors
	public Sphere(){
		
		super();
		tykkelse = 1;
		}
	public Sphere(double r, double t){
		super(r);
		tykkelse = t;
		}
	
	
	//Metoder
	  static double findVoulumout(){ 
		return 4*findAreaOut();
		
	}
	  static double findVoulumInner(){
		
		return 4*findAreaInner(tykkelse); //Får ikke sendt inn en verdi av tykkelse
		
	}
	   static double findweight(){
		  return ( findVoulumout() - findVoulumInner() ) * getIronWeight();
		  
	  }
	   public static void setTykkelse(double t) {

		   tykkelse = t;
		}
	  
	  
	  //Må ha disse for at den skal kjøre
	  
	
	public double findArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double findVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double findSurfacearea() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double findWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}
