//I denne, ikke abstrakte, klassen oppretter vi objekter av typen boks
public class Box extends Rectangle
{
	private double height;

	//Constructors
	protected Box()
	{
		super();
		height = 1;
	}

	protected Box(double t, double l, double w, double h)
	{
		super(t, l, w);
		height = h;
	}

	//Methods
	protected double findVolume()
	{
		return getLength() * getWidth() * height;
	}

	protected double findInnerVolume()
	{
		return (getLength() - 2 * getThickness()) * (getWidth() - 2 * getThickness()) *
		 (height - 2 * getThickness());
	}

	protected double findCircumference()
	{
			return 2 * getLength() + 2 * getWidth() + 2 * height;
	}

	protected double findSurfaceArea()
	{
		return (2 * getLength() * getWidth()) + (2 * getLength() * height) +
		  (2 * getWidth() * height);
	}

	protected double findWeight()
	{
		return ( findVolume() - findInnerVolume() ) * getIronWeight();
	}

	//Endelig metode som vi skriver ut i hovedprogrammet
	public String toString()
	{
		return "\nBox: \n" +
			   super.toString() +
			   "Height: " + String.format("%.2f", height) + " dm.  " +
			   "Circumference: " + String.format("%.2f", findCircumference()) + " dm.\n" +
			   "The box' volume is: " + String.format("%.2f", findVolume()) + " dm^3.\n" +
			   "The box' surfacearea is: " + String.format("%.2f", findSurfaceArea()) + " dm^2.\n" +
			   "The box' weight is: " + String.format("%.2f", findWeight()) + " kg.\n";
	}


}//Box