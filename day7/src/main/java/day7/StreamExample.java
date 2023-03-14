package day7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(1,3,4,5,9,5,9);
		l1.stream().sorted().map(n->n*2).forEach(i->System.out.println(i));
		
		l1.stream().filter(n->n%2==0).forEach(k->System.out.println(k));
		
		int count= (int) l1.stream().filter(n->n%2==0).count();
		System.out.println(count);
		
		// Collectors
		
		List<Integer> l2=  l1.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		//reduce
		
		int sum2=(int) l1.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum2);
		
		//peek
		
		System.out.println(l1.stream().peek(n->n.intValue()));

	}

}
