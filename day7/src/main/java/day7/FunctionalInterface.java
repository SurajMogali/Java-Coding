package day7;

import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

	public static void main(String[] args) {
		Predicate<Integer> p = (n) -> (n > 10) ? true : false;
		System.out.println(p.test(11));
		
		Consumer<Integer> c=(n)-> System.out.println(n);
		c.accept(12);
		
		Supplier<String> s=()->"hello";
		System.out.println(s.get());
		
		Function<String, Integer> f= (str)->str.length();
		System.out.println(f.apply("SURAJ"));
		
		Callable<String> call=()->"hello world";
		System.out.println(call);

	}

}
