public class Box extends Rectangle
{
	private double height;

	//Constructors
	protected Box()
	{
		super();
		height = 1;
	}

	protected Box(double l, double w)
	{
		setLength(l);
		setWidth(w);
	}

	protected Box(double l, double w, double h)
	{
		setLength(l);
		setWidth(w);
		height = h;
	}

	//Methods
	protected double findVolume()
	{
		return getLength() * getWidth() * height;
	}

	protected double findArea()
	{
		return 2 * getLength() * getWidth() + 2 * getLength() *
		  height + 2 * getWidth() * height;
	}

	protected double findCircumference()
	{
			return 2 * getLength() + 2 * getWidth();
	}
	protected double findInnerVolume()
	{
		return (getLength() - 2 * super.getThickness()) * (getWidth() - 2 * super.getThickness()) *
		  (height - 2 * super.getThickness());
	}

	protected double findSurfaceArea()
	{
		return (2 * getLength() * getWidth()) + (2 * getLength() * height) +
		  (2 * getWidth() * height);
	}

	protected double findWeight()
	{
		return this.findVolume() - this.findInnerVolume() * super.getIronWeight();
	}


}//Box