
public class Sphere extends Circle {
	private static double tykkelse; 
	
	//constructors
	public Sphere(){
		
		super();
		}
	public Sphere(double r, double t){
		super(r, t);
		}

	//Methods
	
	/*

	disse metodene må benyttes til fordel for findVolumeout/inner og findAreaout/inner
	da de allerede er definert i GeometricObject på denne måten vil vi slippe og oprette
	unødvendige metoder for at filen ikke må være abstract.

	*/
	public double findVolume() { 
		// Vi må bruke denne metoden for utvendig og innvendig volum
		return 0;
	}
	
	public double findSurfacearea() {
		// Vi må bruke denne metoden for utvendi/innvendig areal
		return 0;
	}

	   public double findWeight(){
		  return 0;




		  //return ( ( findVolumeout() - findVolumeInner() ) * getIronWeight() );
		  
	  }

//Disse bør ikke brukes - har tatt vare på de pga formler
	  
	  /*
	  static double findVolumeout(){ 
		return 4*findAreaOut();
		
	}
	  static double findVolumeInner(){
		
		return 4*findAreaInner(tykkelse); 
		
	}

	//disse må ordnes - må benytte metoden findSurfacearea istedet.
	
	public static double findAreaOut() {
		return (getRadius() * getRadius() ) * Math.PI;
	}
	
	public static double findAreaInner(double t) {
		double NewRadius = getRadius() - getThickness() ;
		return  (NewRadius*NewRadius)* Math.PI;
		
	}

	*/
	  
	 
} //Sphere
