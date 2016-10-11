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
		return (getLength() - 2 * getThickness()) * (getWidth() - 2 * getThickness()) * (height - 2 * getThickness());
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
		return (getLength() * getWidth() * height - findVolume()) * getIronWeight();
	}

	public String toString()
	{
		return super.toString() +
		 "The box' height is: " + String.format("%.2f", height) + " dm\n" +
		 "The box' inner volume is: " + String.format("%.2f", findVolume()) + " dm3/3\n" +
		 "The box' circumference: " + String.format("%.2f", findCircumference()) + " dm\n" +
		 "This box has a surfacearea of: " + String.format("%.2f", findSurfaceArea()) + " dm/2\n" +
		 "The weight of the box is: " + String.format("%.2f", findWeight()) + " kg";
	}


}//Box