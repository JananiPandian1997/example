package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctandLimit {
	public static void main(String[] args) {
		ArrayList<String> f = new ArrayList<>();
		f.add("banana");
		f.add("mango");
		f.add("watermelon");
		f.add("grapes");
		f.add("orange");
		f.add("orange");
		//System.out.println("--------distinct()----");
		//f.stream().distinct().forEach(x->System.out.println(x));
		//List<String> a = f.stream().distinct().collect(Collectors.toList());
		//a.forEach(x->System.out.println(x));
				
		//System.out.println("--------limit()----");
		//f.stream().limit(2).forEach(x->System.out.println(x));
		//List<String> b = f.stream().limit(3).collect(Collectors.toList());
		//b.forEach(x->System.out.println(x));
		//System.out.println("--------anymatch()----");
		//boolean match = f.stream().anyMatch(x->x.contains("mango"));
		//System.out.println(match);
		//System.out.println("----allmatch()-----");
		//boolean match = f.stream().allMatch(x->x.startsWith("g"));
		//System.out.println(match);
		//System.out.println("------sorted()----");
		//f.stream().sorted().forEach(x->System.out.println(x));
		//List<String> r = f.stream().sorted().collect(Collectors.toList());
		//System.out.println(r);
		List<String> i = f.stream().
	}

}
