public class Box extends Rectangle
{
	private double height;

	//Constructors
	protected Box()
	{
		super();
		height = 1;
	}

	protected Box(double l, double w, double h)
	{
		super(l, w);
		height = h;
	}

	//Methods
	protected double findVolume(double l, double w, double h)
	{
		return 	l * w * h;
	}

	protected double findSurfaceArea(double l, double w, double h)
	{
		return (2 * l * w) + (2 * l * h) + (2 * w * h);
	}

	protected double findCircumference(double l, double w, double h)
	{
		return (4 * l + 4 * w + 4 * h);
	}

	protected double findWeight()
	{
		return 2 * 2;
	}


}//Box