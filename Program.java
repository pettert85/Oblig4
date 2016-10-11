
import java.util.Scanner;

public class Program{

	public static void main (String[] args){
		double radius;
		double tykkelse,height,length, width;
		
				Scanner input = new Scanner(System.in);
		int figure;
//Select figure
		System.out.print("Select a figure: \n Sphere = 1 \n Cylinder = 2 \n Cone = 3 \n Box = 4 \n Prism = 5 \n");
			do{ 
				figure = input.nextInt();
			
				if (figure<1 || figure>5){
					System.out.println("You can only select a defined shape");
					}
				
			}while(figure<1 || figure>5);
			
		

		if (figure == 1 ){//Sphere
			do {
				System.out.print("Tast in radius: ");
				radius = input.nextDouble();
	
				System.out.print("Tast in Thickness: ");
				tykkelse = input.nextDouble();
				
				if (radius<tykkelse){
					System.out.println("Thickness can not be bigger than radius");  
				}
			}while(radius<tykkelse);
			
			GeometricObject sphere = new Sphere(radius, tykkelse);

			System.out.println(sphere.toString());
			}
		
		if (figure == 2 ){//Cylinder
			do {
				System.out.print("Tast in radius: ");
				radius = input.nextDouble();
	
				System.out.print("Tast in height: ");
				height = input.nextDouble();
				
				System.out.print("Tast in Thickness: ");
				tykkelse = input.nextDouble();
				
				if (radius<tykkelse || height<2*tykkelse){
					System.out.println("Thickness can not be bigger than radius or height");  
				}
			}while(radius<tykkelse || height<2*tykkelse);
			
			GeometricObject sylinder = new Cylinder(radius, tykkelse , height);

			System.out.print( sylinder.toString() );
		}
		
		/*
		if (figure == 3 ){//Cone
			do {
				System.out.print("Tast in radius: ");
				radius = input.nextDouble();
	
				System.out.print("Tast in height: ");
				height = input.nextDouble();
				
				System.out.print("Tast in Thickness: ");
				tykkelse = input.nextDouble();
				
				if (radius<tykkelse || height<2*tykkelse){
					System.out.println("Thickness can not be bigger than radius or height");  
				}
			}while(radius<tykkelse || height<2*tykkelse);
			
			GeometricObject cone = new Cone(radius, tykkelse , height);

			System.out.print( cone.toString() );
		}*/
		
		
		if (figure == 4 ){//Box
			do {
				System.out.print("Tast in lenght: ");
				length = input.nextDouble();
				
				System.out.print("Tast in Width: ");
				width = input.nextDouble();
	
				System.out.print("Tast in height: ");
				height = input.nextDouble();
				
				System.out.print("Tast in Thickness: ");
				tykkelse = input.nextDouble();
				
				if (length<2*tykkelse || height<2*tykkelse || width<2*tykkelse ){
					System.out.println("Thickness can not be bigger than twice the length, width or height");  
				}
			}while(length<2*tykkelse || height<2*tykkelse || width<2*tykkelse );
			
			GeometricObject box = new Box(tykkelse, length , width, height);

			System.out.print( box.toString() );
		}
		
		/*
		if (figure == 5 ){//Prism
			do {
				System.out.print("Tast in radius: ");
				lenght = input.nextDouble();
	
				System.out.print("Tast in height: ");
				height = input.nextDouble();
				
				System.out.print("Tast in Thickness: ");
				tykkelse = input.nextDouble();
				
				if (radius<tykkelse || height<2*tykkelse){
					System.out.println("Thickness can not be bigger than radius or height");  
				}
			}while(radius<tykkelse || height<2*tykkelse);
			
			GeometricObject prism = new Prism(radius, tykkelse , height);

			System.out.print( prism.toString() );
		}*/
		

  	}
}

