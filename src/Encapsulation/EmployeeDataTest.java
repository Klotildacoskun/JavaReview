package Encapsulation;

class EmployeeData{
	private int ssn;
	private String employeeName;
	private int empAge;
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	
}
public class EmployeeDataTest {

	public static void main(String[] args) {
		EmployeeData emp=new EmployeeData();
		emp.setEmpAge(35);
		emp.setEmployeeName("John Smith");
		emp.setSsn(1233456);
		System.out.println("Employee age is : "+emp.getEmpAge());
		System.out.println("Employee name is : "+emp.getEmployeeName());
		System.out.println("Employee ssn is:"+ emp.getSsn());
		

	}

}
