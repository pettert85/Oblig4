public class Circle extends GeometricObject {
	
	private double radius;
	
		public Circle(){
			radius = 1;
		}
		public Circle(double r){
			radius = r;
		}
		double getRadius(){
			return radius;
		}
		public double findArea(){
			return radius*radius*Math.PI; //asfjasklfjkldax
		}
		double findCircumference(){
			return radius*2*Math.PI;
		}
		
		
}
