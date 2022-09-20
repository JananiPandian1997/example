package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlapMap {
	public static void main(String[] args) {
		//List<Integer> add = Arrays.asList(1,2,3,4,5);
		//List<Integer> sub = Arrays.asList(6,7,8,9,4);
		//List<List<Integer>> real = new ArrayList<>();
		//real.add(add);
		//real.add(sub);
		//real.stream().flatMap(x->x.stream()).forEach(s->System.out.println(s));
		List<String> a = Arrays.asList("akika","janani","lakshmi","pandian");
		List<String> b = Arrays.asList("sasi","aravind","selvi","125");
		List<List<String>> real = new ArrayList<>();
		real.add(a);
		real.add(b);
		real.stream().flatMap(x->x.stream()).forEach(s->System.out.println(s));
		
		
		
	}

}
