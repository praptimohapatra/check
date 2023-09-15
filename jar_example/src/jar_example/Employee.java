package jar_example;

public class Employee {
	private int emp_id,salary;
	private String name,address,department,email;
	
	public int getEmp_id() {
		return emp_id;
		
	}
	public void setEmp_id(int emp_id) {
		this.emp_id=emp_id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}public String getDepartment()
	{
		return name;
	}
	public void setDepartment(String department)
	{
		this.department=department;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void empDetails()
	{
		System.out.println("Employee id"+emp_id);
		System.out.println("Employee salary"+salary);
		System.out.println("Employee name"+name);
		System.out.println("Employee address"+address);
		System.out.println("Employee department"+department);
		System.out.println("Employee email"+email);
	}
	
	

}
 
	 
 
