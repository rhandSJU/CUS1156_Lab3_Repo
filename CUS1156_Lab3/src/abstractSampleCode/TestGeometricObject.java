package abstractSampleCode;
public class TestGeometricObject {
	
	
	public static void main(String args[]){
		GeometricObject geo1 = new Circle(5);
		GeometricObject geo2 = new Rectangle(5,3);
		System.out.println("Is the area the same? "+ equalArea(geo1,geo2));
	}
	
	public static boolean equalArea(GeometricObject geo1, GeometricObject geo2){
		return geo1.getArea()==geo2.getArea();
	}
	
	Double doub = new Double(5);
	
	
}