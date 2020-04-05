package akshay;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormatDemo {
	
	public static void main(String[] args) {
		
		NumberFormat cnf = NumberFormat.getCompactNumberInstance();
		String thousand = cnf.format(1000);
		
		//Will print 1K
		System.out.println(thousand);
		
		String million = cnf.format(1_000_000);
		
		//Will print 1M
		System.out.println(million);
		
		cnf.setMaximumFractionDigits(2);
		
		String millionAndHalf = cnf.format(1_500_000);
		
		//Will print 1.5M
		System.out.println(millionAndHalf);
		
		//Number Formats with Locale
		NumberFormat cnfgerman = NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.SHORT);
		thousand = cnfgerman.format(1000);
		
		//Will print 1.000
		System.out.println(thousand);
		
		million = cnfgerman.format(1_000_000);
		
		//Will print 1 Mio.
		System.out.println(million);
	}
}
