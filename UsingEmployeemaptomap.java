package streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class UsingEmployeemaptomap {
	public static void main(String[] args) {
		HashMap<Integer,Employee> e = new HashMap<>();
		Employee emp1 =new Employee("janani",123,24,20000,"senior coder",5000);
		Employee emp2 =new Employee("lakshmi",456,50,60000,"manager",1000);
		Employee emp3 =new Employee("pandian",789,35,50000,"team lead",7000);
		Employee emp4 =new Employee("kanmani",147,29,20000,"senior coder",5000);
		Employee emp5 =new Employee("aravind",258,27,15000,"junior coder",4000);
		Employee emp6 =new Employee("ruthika",369,26,20000,"senior coder",3000);
		
		e.put(emp1.getid(),emp1);
		e.put(emp2.getid(),emp2);
		e.put(emp3.getid(),emp3);
		e.put(emp4.getid(),emp4);
		e.put(emp5.getid(),emp5);
		e.put(emp6.getid(),emp6); 
		Map<Integer,Employee> t = e.values().stream().filter(x->x.getage()>27).collect(Collectors.toMap(x->x.getid(),y->y));
		t.forEach((x,y)->System.out.println(x+" "+y));
	}
	

}
