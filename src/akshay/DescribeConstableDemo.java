package akshay;

import java.util.Optional;

public class DescribeConstableDemo {
	
	public static void main(String[] args) {
		
		String so = "Hello";
		Optional<String> os = so.describeConstable();
		System.out.println(os);
		System.out.println(os.get());
	}
}
