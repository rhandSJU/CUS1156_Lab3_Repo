package abstractSampleCode;

public class Circle extends GeometricObject  {
	private double radius;
	
	public Circle(){
		
	}
	
	public Circle(double radius){
		this.radius = radius;
		
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	

	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	public void printCircle(){
		System.out.println("The radius is: "+ radius);
		System.out.println("The Area is: "+ getArea());
		System.out.println("The Perimeter is: "+ getPerimeter());

	}
	
	
	public static void main (String args[]){
		Circle obj = new Circle(2.2);
		obj.printCircle();
	}
	
	
}
