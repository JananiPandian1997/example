package streams;

public class Employee {
	private String name;
	private int id;
	private int age;
	private int salary;
	private String designation;
	private int expenditure;
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
	public String getdesignation() {
		return designation;
	}
	public void setdesignation(String designation) {
		this.designation = designation;
	}
	public int getexpenditure() {
		return expenditure;
	}
	public void setexpenditure(int expenditure) {
		this.expenditure = expenditure;
	}
	public Employee(String name,int id,int age,int salary,String designation,int expenditure) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.salary=salary;
		this.designation=designation;
		this.expenditure=expenditure;
	}
	public String toString() {
		return "name=" + name + ", "+"id="+ id + ", "+"age=" + age + ", "+"salary=" + salary + ", "+"designation="
				+ designation + ", "+"expenditure=" + expenditure;
	}
	

}
