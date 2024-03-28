package overloadingandoverridingpolymorbism;

class Employee
{
	protected int id; 
	
	protected String name;
	
	protected String phoneno;
	
	protected String salary;

	public Employee(int id, String name, String phoneno, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public void getEmployeeDetails()
	{
		System.out.println("EMPLOYEE ID:"+id+"\nEMPLOYEE  NAME:"+name+"\nEMPLOYEE  PHONENO:"+phoneno+"\nEMPLOYEE SALARY:"+salary);
	}

}
class HouredEmployee extends Employee
{

	public HouredEmployee(int id, String name, String phoneno, String salary) {
		super(id, name, phoneno, salary);
		
	}
	
	public void getEmployeeDetails()
	{
		System.out.println("HOURED EMPLOYEE ID:"+id+"\nHOURED EMPLOYEE  NAME:"+name+"\nHOURED EMPLOYEE  PHONENO:"+phoneno+"\nHOURED EMPLOYEE SALARY:"+salary);
	}

}

class SalariedEmployee extends Employee
{

	public SalariedEmployee(int id, String name, String phoneno, String salary) {
		super(id, name, phoneno, salary);
		
	}
	
	public void getEmployeeDetails()
	{
		System.out.println("SALARIED EMPLOYEE ID:"+id+"\nSALARIED HOURED EMPLOYEE  NAME:"+name+"\nSALARIED EMPLOYEE  PHONENO:"+phoneno+"\nSALARIED EMPLOYEE SALARY:"+salary);
	}
	
}
	

public class EmployeeClass {
	
	public static void main(String[] args)
	{
		Employee e=new HouredEmployee(12,"naveen","9827382738","15,000");
		
		Employee e1=new SalariedEmployee(13,"praveen","9837281909","30000");
		
		e.getEmployeeDetails();
		
		e1.getEmployeeDetails();
		
	}
	

}
