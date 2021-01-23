package assesment_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		System.out.println("File Manager Starting ...");
		System.out.println("Developed by Akshay Dhillon \n \n");
		fileApp();
	}
	
	public static void fileApp() {
		FileManagement f = new FileManagement();
		int selectedOption = 3;

		Scanner sc = new Scanner(System.in);
		do {
			
				System.out.println("Enter 1 to list all the files (Sorted Order)");
				System.out.println("Enter 2 to Perform Operations like Add, Delete and Search");
				System.out.println("Enter 3 to Exit the Application");
			
				System.out.print("Please Enter you choice : ");
				try {
					selectedOption = sc.nextInt();	
			
					System.out.println();
					if(selectedOption == 1) {
						f.listAllFiles();
					} else if(selectedOption == 2) {
						fileCRUDOperation(f);
					} else if(selectedOption == 3) {
						System.out.println("Exiting the Application ...");
					} else {
						System.out.println("Please Enter a Valid Choice ");
					} 	
				} catch(Exception exception) {
					System.out.println("\nException Occured Invalid Input ");
					fileApp();
				}
			
			
		} while (selectedOption != 3);
	
	}
	
	public static void fileCRUDOperation(FileManagement fileManager) {
		Scanner sc = new Scanner(System.in);

		int selectedOption = 4;
		
		do {
			System.out.println("Enter 1 to Add a file");
			System.out.println("Enter 2 to Delete a file");
			System.out.println("Enter 3 to Search a file");
			System.out.println("Enter 4 to back to the Main Application");
			
			System.out.print("Please Enter you choice: ");
			try {
				selectedOption = sc.nextInt();	
				System.out.println();

				if(selectedOption == 1) {
					System.out.println("Enter the file name: ");
					String fileName = sc.next();
					System.out.println(fileManager.createFile(fileName));
				
				} else if(selectedOption == 2) {
					System.out.println("Enter the file name: ");
					String fileName = sc.next();
					System.out.println(fileManager.deleteFile(fileName));
				
				} else if(selectedOption == 3) {
					System.out.println("Please enter the file name to search");
					String fileName = sc.next();
					fileManager.searchFiles(fileName);
				} else if(selectedOption == 4) {
					System.out.println("Exiting the Application ...");
				} else {
					System.out.println("Please Enter a Valid Choice ");
				}
			} catch(InputMismatchException exception) {
				System.out.println("Invalid Input");
				fileCRUDOperation(fileManager);
			} catch(Exception exception) {
				System.out.println(exception.getStackTrace());
				fileCRUDOperation(fileManager);
			}

			
		} while(selectedOption != 4);
		
		
	}
}
