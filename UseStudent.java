package streams;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;


public class UseStudent {
	public static void main(String[] args) {
		Student student1 = new Student("akila",123,8,15,499,"female");
		Student student2 = new Student("janani",456,9,16,456,"female");
		Student student3 = new Student("rutika",789,10,17,895,"female");
		Student student4 = new Student("aravind",147,11,18,753,"male");
		Student student5 = new Student("pandian",258,8,15,951,"male");
		ArrayList<Student> s = new ArrayList<>();
		s.add(student1);
		s.add(student2);
		s.add(student3);
		s.add(student4);
		s.add(student5);
		List<Student> a= s.stream().filter(x->x.getAge()>15).collect(Collectors.toList());
		a.forEach(y->System.out.println(y));
		System.out.println("-----using for loop-----");
		for(Student b : a) {
			System.out.println(b);
		}
		System.out.println("-----without collector----");
		s.stream().filter(x->x.getMark()>500).forEach(y->System.out.println(y));
		System.out.println("-----map-----");
		List<Integer> b = s.stream().map(x->x.getAge()).collect(Collectors.toList());
		b.forEach(y->System.out.println(y));
		System.out.println("-----using for loop-----");
		for(Integer c :b) {
			System.out.println(c);
		}
		System.out.println("----- map without collector----");
		s.stream().map(x->x.getStandard()).forEach(y->System.out.println(y));
		System.out.println("----- count----");
		long w = s.stream().count();
		System.out.println(w);
		long r = s.stream().filter(x->x.getStandard()>8).count();
		System.out.println(r);
		
		
		


			
		}
		
	}
	
		

		
