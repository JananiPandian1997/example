package streams;

public class Student {
	private String name;
	private int rollno;
	private int standard;
	private int age;
	private int mark;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student(String name,int rollno,int standard,int age,int mark,String gender) {
		this.name=name;
		this.rollno=rollno;
		this.standard=standard;
		this.age = age;
		this.mark=mark;
		this.gender=gender;
	}
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", standard=" + standard + ", age=" + age + ", mark="
				+ mark + ", gender=" + gender + "]";
	}
}


