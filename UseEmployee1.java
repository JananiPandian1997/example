package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee1 {
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
		System.out.println("------using mapmethod-----");
		List<String> d = e.stream().map(x->x.getname()).collect(Collectors.toList());
		d.forEach(y->System.out.println(y));
		System.out.println("----------------using for loop-----------------");
		for(String str : d) {
			System.out.println(str);
		}
		System.out.println("---------without collector--------");
		e.stream().map(x->x.getage()).forEach(T->System.out.println(T));
		e.stream().map(x->x.getdesignation()).forEach(T->System.out.println(T));
		
	}

}
