public abstract class Rectangle extends GeometricObject
{
	private static double length, width;

	//Default Constructor
	protected Rectangle()
	{
		super();
		length = 2;
		width = 1;
	}

	//Constructor
	protected Rectangle (double l, double w)
	{
		length = l;
		width = 1;
	}

	//Methods
	protected double findArea(double l, double w)
	{
		return l*w;
	}


	protected double findCircumference (double l, double w)
	{
		return 2 * l + 2 * w;
	}

	//Getters n' setters
	public static double getLength()
	{
		return length;
	}

	public static void setLength(double l)
	{
		length = l;
	}

	public static double getWidth()
	{
		return width;
	}

	public static void setWidth(double w)
	{
		width = w;
	}



}//Rectangle