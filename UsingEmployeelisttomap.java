package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UsingEmployeelisttomap {
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
		Map<Integer, Employee> w = e.stream().collect(Collectors.toMap(Employee::getid,Function .identity()));
		System.out.println(w);
		w.forEach((a,b)->System.out.println(a+" "+b));
		System.out.println("-------list to map-----");
		Map<String,String> r = e.stream().collect(Collectors.toMap(Employee::getname,Employee::getdesignation));
		r.forEach((x,y)->System.out.println(x+" "+y));
		System.out.println("---------");
		Map<Integer,Employee> t = e.stream().filter(x->x.getage()>29).collect(Collectors.toMap(x->x.getid(),y->y));
		t.forEach((x,y)->System.out.println(x+" "+y));
		
		
		
		
	}

}
