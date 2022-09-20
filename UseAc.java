package streams;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UseAc {
	public static  void main(String[] args) {
		AC ac1 = new AC("samsung",15000,"abcd");
		AC ac2 = new AC("LG",20000,"efgh");
		AC ac3 = new AC("Sony",18000,"ijkl");
		AC ac4 = new AC("blueStar",20000,"mnop");
		HashMap<Integer,AC> a = new HashMap<>();
		a.put(1,ac1);
		a.put(2,ac2);
		a.put(3,ac3);
		a.put(4,ac4);
		List<Integer> b = a.keySet().stream().collect(Collectors.toList());
		b.forEach(x->System.out.println(x));
		System.out.println("----using for loop---");
		for(Integer i : b) {
			System.out.println(i);
		}
		System.out.println("------values-----");
		List<AC> c = a.values().stream().filter(x->x.getPrice()>15000).collect(Collectors.toList());
		c.forEach(y->System.out.println(y));
		
		
	}

}
