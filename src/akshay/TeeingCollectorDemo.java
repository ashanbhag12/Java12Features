package akshay;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollectorDemo {
	
	public static void main(String[] args) {
		
		var ints = Stream.of(1,2,3,4,5);
		
		long average = ints.collect(Collectors.teeing(Collectors.summingInt(Integer::valueOf), 
														Collectors.counting(),
														(sum, count) -> sum / count));
		
		System.out.println(average);
	}
}
