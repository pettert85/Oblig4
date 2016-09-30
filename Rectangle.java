public class Rectangle extends GeometricObject
{
	private double height;
	private double length;


	//Default Constructor
	public Rectangle()
	{
		height = 1;
		length = 2;
	}

	//Constructor
	public Rectangle (double h, double l)
	{
		height = h;
		length = l;
	}

	//Method
	double findArea(double h, double l)
	{
		return h * l;
	}

	//Method
	double findCircumference (double h, double l)
	{
		return 2 * h + 2 * l;
	}
}