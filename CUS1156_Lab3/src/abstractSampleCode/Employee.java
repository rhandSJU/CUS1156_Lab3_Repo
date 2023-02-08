package abstractSampleCode;

public class Employee implements Comparable<Employee> {
	String ID, name;
	double salary;
	
	public Employee(String empid, String nm, double pay){
		this.ID = empid;
		this.name = nm;
		this.salary = pay;
	}
	
	public static void EmployeePrinter(Employee array[]){
		for(int i = 0; i < array.length; i++){
			System.out.println("Employee "+ i + " details: " + array[i].ID + " " + array[i].name + " " + array[i].salary);
		}
		
	}
	
	
	public static void main (String args[]){
		Employee employeeaArray[] = {new Employee("281273", "John Doe", 12312.98), 
				new Employee("324234234", "Mary Jane", 23423423.879)};
		EmployeePrinter(employeeaArray);
	}

	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		return Double.compare(salary, other.salary);
	}


}
	


