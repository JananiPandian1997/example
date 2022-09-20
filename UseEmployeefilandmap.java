package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployeefilandmap {
	public static void main(String[] args) {
		Employee emp1 =new Employee("janani",123,24,20000,"senior coder",5000);
		Employee emp2 =new Employee("lakshmi",456,50,60000,"manager",1000);
		Employee emp3 =new Employee("pandian",789,35,50000,"team lead",7000);
		Employee emp4 =new Employee("kanmani",147,29,20000,"senior coder",5000);
		Employee emp5 =new Employee("aravind",258,27,15000,"junior coder",4000);
		Employee emp6 =new Employee("ruthika",369,26,20000,"senior coder",3000);
		ArrayList<Employee> e = new ArrayList<>();
		e.add(emp1);
		e.add(emp2);
		e.add(emp3);
		e.add(emp4);
		e.add(emp5);
		e.add(emp6);
		List<String> a = e.stream().filter(x->x.getsalary()>15000).map(y->y.getname()).collect(Collectors.toList());
		a.forEach(b->System.out.println(b));
		System.out.println("-----without collect-----");
		e.stream().filter(x->x.getsalary()>20000).map(y->y.getname()).forEach(s->System.out.println(s));
		System.out.println("------find age-------");
		
		e.stream().filter(x->x.getdesignation().equals("manager")).map(y->y.getage()).forEach(w->System.out.println(w));
		System.out.println("------using collector-------");
		List<Integer> b = e.stream().filter(x->x.getdesignation().equals("manager")).map(y->y.getage()).collect(Collectors.toList());
		b.forEach(i->System.out.println(i));
		
	}
	


}
