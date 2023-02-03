package sampleCode;

public class PhysicsTeacher extends Teacher{
	String subject = "Physics";
	
	public static void main(String [] args){
		PhysicsTeacher obj = new PhysicsTeacher();
		//System.out.println(obj.subject);
		
		//Inherited from Teacher Superclass
//		System.out.println(obj.collegeName);
//		System.out.println(obj.designation);
		
		Teacher obje = new Teacher();
		System.out.println(obje.collegeName);
		System.out.println(obje.designation);
		//System.out.println(obje.subject);
		


		
	}
}