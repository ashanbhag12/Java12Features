package akshay;

import java.text.CompactNumberFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

public class CustomCompactNumberFormatDemo {
	
	public static void main(String[] args) {
		
		String[] compactPatterns = {"","","","0K","00K","0Lac","00Lac","0Cr","00Cr"};
		NumberFormat customNF = new CompactNumberFormat("", DecimalFormatSymbols.getInstance(), compactPatterns);
		String thousand = customNF.format(1000);
		
		//Will print 1K
		System.out.println(thousand);
		
		String lac = customNF.format(30_00_000);
		
		//Will print 30Lac
		System.out.println(lac);
		
		customNF.setMaximumFractionDigits(2);
		String crores = customNF.format(3_25_00_000);
		
		//Will print 3.25Cr
		System.out.println(crores);
	}
}
