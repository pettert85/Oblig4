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
	protected Rectangle (double t, double l, double w)
	{
		super(t);
		length = l;
		width = w;
	}

	//Methods
	protected double findArea()
	{
		return length * width;
	}


	protected double findCircumference(double l, double w)
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

	public String toString()
	{
		return "The length is: " + length + "\n" +
		  "The width is: " + width + "\n" +
		  "The area of the base is: " + findArea() + "\n" +
		  super.toString();
	}

}//Rectangle