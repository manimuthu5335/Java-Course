package org.alphatechsolutions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CompTwoDiffFiles {

	public static void main(String[] args) throws IOException{
		BufferedReader read1 = new BufferedReader(new FileReader("Z:\\java\\Samp1.txt"));
		BufferedReader read2 = new BufferedReader(new FileReader("Z:\\java\\Samp2.txt"));
		
		String line1 = read1.readLine();
		String line2 = read2.readLine();
		int lineNum = 1;
		boolean areEqual = true;
		while (line1 != null || line2 != null) {
			if (line1 == null || line2 == null) {
				areEqual = false;
				break;
			}
			else if(! line1.equalsIgnoreCase(line2)) {
				areEqual = false;
				break;
			}
			line1 = read1.readLine();
			line2 = read2.readLine();
			lineNum++;
		}
		if(areEqual) {
			System.out.println("Both files have same content");
		}
		else {
			System.out.println("Both files have different content");
			System.out.println("In Both files, is difference at line number: "+lineNum);
			System.out.println("One file has "+line1+" and another file has "+line2+" at line "+lineNum);

		}
		read1.close();
		read2.close();
		

	}

}
