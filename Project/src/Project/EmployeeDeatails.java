package Project;

public class EmployeeDeatails extends Employee implements Student,Student2{

	@Override
	public String salary() {
		
		return "This from salary";
	}

	@Override
	public String roll() {
		
		return null;
	}

	@Override
	public String department() {
		
		return null;
	}

	@Override
	public String study() {
	
		return null;
	}

	@Override
	public String exam() {
		
		return null;
	}
}