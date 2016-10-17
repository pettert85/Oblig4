
import java.util.Scanner;

public class Program{

	public static void main (String[] args){
		double radius;
		double tykkelse, height, length, width;

				Scanner input = new Scanner(System.in);
		int figure;
//Select figure


			do{
				do{
					System.out.print("Select a figure: \n Sphere = 1 \n Cylinder = 2 \n Cone = 3 \n Box = 4 \n" +
					"(Enter 0 to exit)");

					figure = input.nextInt();

					if (figure<-1 || figure>4){
						System.out.println("You can only select a defined shape");
					}

					}while(figure<0 || figure>4);

						if (figure == 1 ){//Sphere
							System.out.print("Enter radius (in dm): ");
							radius = input.nextDouble();

						do {

							System.out.print("Enter Thickness: (in dm) ");
							tykkelse = input.nextDouble();

							if (radius<tykkelse){
								System.out.println("Thickness can not be bigger than radius");
							}

						}while(radius<tykkelse);

						GeometricObject sphere = new Sphere(radius, tykkelse);

						System.out.println(sphere.toString());
					}//if Sphere

					if (figure == 2 ){//Cylinder

						System.out.print("Enter radius (in dm): ");
						radius = input.nextDouble();

						System.out.print("Enter height (in dm): ");
						height = input.nextDouble();

						do {

							System.out.print("Enter Thickness (in dm): ");
							tykkelse = input.nextDouble();

							if (radius<tykkelse || height<2*tykkelse){
								System.out.println("Thickness can not be bigger than radius or height");
							}
						}while(radius<tykkelse || height<2*tykkelse);

						GeometricObject sylinder = new Cylinder(radius, tykkelse , height);

						System.out.print( sylinder.toString() );
					}//if Cylinder


					if (figure == 3 ){//Cone

						System.out.print("Enter radius (in dm): ");
						radius = input.nextDouble();

						System.out.print("Enter height (in dm): ");
						height = input.nextDouble();

						do {

							System.out.print("Enter Thickness (in dm): ");
							tykkelse = input.nextDouble();

							if (radius<tykkelse || height<2*tykkelse){
								System.out.println("Thickness can not be bigger than radius or height");
							}
						}while(radius<tykkelse || height<2*tykkelse);

						GeometricObject cone = new Cone(radius, tykkelse , height);

						System.out.print( cone.toString() );
					}//if Cone


					if (figure == 4 ){//Box

						System.out.print("Enter lenght (in dm): ");
						length = input.nextDouble();

						System.out.print("Enter width (in dm): ");
						width = input.nextDouble();

						System.out.print("Enter height (in dm): ");
						height = input.nextDouble();

						do {

							System.out.print("Enter Thickness (in dm): ");
							tykkelse = input.nextDouble();

							if (length<2*tykkelse || height<2*tykkelse || width<2*tykkelse ){
								System.out.println("Thickness can not be bigger than twice the length, width or height");
							}
						}while(length<2*tykkelse || height<2*tykkelse || width<2*tykkelse );

						GeometricObject box = new Box(tykkelse, length , width, height);

						System.out.print( box.toString() );
					}//if Box

			}/*Upper do while*/ while (figure != 0);
	}//Main
}//Class

