package akshay;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileContentsMatchDemo {
	
	public static void main(String[] args) {
		
		Path file1 = Path.of("/file1");
		Path file2 = Path.of("/file2");
		
		try {
			//Finds and returns the position of the first mismatched byte in the content of two files, or -1L if there is no mismatch. 
			//The position will be in the inclusive range of 0L up to the size (in bytes) of the smaller file.
			long mismatch = Files.mismatch(file1, file2);
			System.out.println(mismatch);
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}
}
