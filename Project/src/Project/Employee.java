package Project;

public  abstract class Employee
{
	private String EmployeeID;
	private String EmployeeName;
	private String BasicSalary;
	private String Department;
	
	public String attendence()
	{
		
		return "This from Attendence";
	}
	
	public abstract String salary();
	
	public String getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getBasicSalary() {
		return BasicSalary;
	}
	public void setBasicSalary(String basicSalary) {
		BasicSalary = basicSalary;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
}
