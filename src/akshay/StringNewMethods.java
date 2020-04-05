package akshay;


public class StringNewMethods {
	
	public static void main(String[] args) {
		
		//indent
		String greeting = "Hello";
		greeting = greeting.indent(2);
		System.out.println(greeting);
		
		var str = "This \nis a \nmultiline \nstring";
		str = str.indent(5);
		str.lines().forEach(System.out::println);
		
		//transform
		String test = "This is, a test, String, to say, Hello, World,,,";
		
		String[] cleanedUpperCaseWords = test.transform(StringNewMethods::removeComma)
												.transform(String::toUpperCase)
												.transform(StringNewMethods::words);
		
		for(String word : cleanedUpperCaseWords)
			System.out.println(word);
	}
	
	private static String removeComma(String s) {
		
		return s.replaceAll(",", "");
		
	}
	
	private static String[] words(String s) {
		
		return s.split(" ");
		
	}
}
