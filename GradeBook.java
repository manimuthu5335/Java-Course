package alphatechsolutions.org;

import java.util.ArrayList;

import java.util.Scanner;

public class GradeBook{

	
	
//	private static ArrayList<Double> Collections;

	public static void main(String[] args) {
		
		// Create Variables
		int option = 0;
		System.out.println("Welcome To The Gradebook");
		Scanner userIn = new Scanner(System.in);
		
		ArrayList<Double> gradeBook = new ArrayList<>();
		
		// Menu Loop
		while(option!=6) {
			// Print main menu
			System.out.println("<---------------------------------------------->");
			System.out.println("Please Select An Option From The List Below:");
			System.out.println("1-> Enter Values");
			System.out.println("2-> Modify Entry");
			System.out.println("3-> Delete Entry");
			System.out.println("4-> View Data ");
			System.out.println("5-> View All  Entries");
			System.out.println("6-> Exit");
			System.out.println("<---------------------------------------------->");
			
			// user to select option
			option = userIn.nextInt();	
			
			// option 1 - Enter values
			if(option==1) {
				System.out.println("Please Enter Values. -1 to Exit");
				double gradeBookEntry = 0;
				//while loop for entering data
				while(true) {
					gradeBookEntry = userIn.nextDouble();
					
					//Exit if -1
					if(gradeBookEntry==-1) {
						break;
					}
					else {
						gradeBook.add(gradeBookEntry);
					}
				}
				
			}
			// option 2 - Modify Entry
			if(option==2) {
				System.out.println("Which index would you like to modify?");
				int index = userIn.nextInt();
				System.out.println("Replace Index:"+ index+ " Value: "+gradeBook.get(index)+"with what?");
				gradeBook.set(index, userIn.nextDouble());
				System.out.println("Successfully Set");
			}
			//option 3 - Delete
			if(option==3) {
			System.out.println("Which index would you like to delete? & Enter Ur Choice");
			int index = userIn.nextInt();
			gradeBook.remove(index);
			System.out.println("Removed");
			}
			//option 5 - View Elements
			if(option==5) {
				System.out.println("|Index| Value");
				for(int i = 0; i<gradeBook.size();i++) {
					//Create Rows
					System.out.println("| "+ i + " | "+ gradeBook.get(i));
				}
			}
			//option 4 - View data
			if(option==4) {
				//calculate Average
				double total = 0;
				for(int i = 0;i<gradeBook.size();i++) {
					total = total + gradeBook.get(i);
				}
				double average = total/gradeBook.size();
				
				//sort gradeBook
				ArrayList<Double> copiedGradeBook = new ArrayList<>();
				copiedGradeBook.addAll(gradeBook);
				
//				Collections.sort(copiedGradeBook);
				// Extract max and min
				double max = copiedGradeBook.get(gradeBook.size()-1);
				double min = copiedGradeBook.get(0);
				
				// find median
				double median =0;
				if(copiedGradeBook.size()%2==1) {
					median = copiedGradeBook.get(copiedGradeBook.size()/2);
				}
				else {
					int secIndex = copiedGradeBook.size()/2;
					double firstMedian = copiedGradeBook.get(secIndex -1);
					double secondMedian = copiedGradeBook.get(secIndex);
					median = (firstMedian+secondMedian)/2.0;
					
				}
				System.out.println("Database Data");
				System.out.println("Average: "+ average);
				System.out.println("Min:     "+ min);
				System.out.println("Max:     "+ max);
				System.out.println("Median:  "+ median);
				System.out.println("Elements:"+ gradeBook.size());
			
			}
			
			
		
		}
		
	}

}

