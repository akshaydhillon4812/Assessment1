package assesment_java;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import assesment_java.Exceptions.FileAlreadyPresentException;

public class FileManagement {

	private File filePointer;
	private String currentDirectory;
	
	public FileManagement() {
		this.currentDirectory = "UserFiles/";
	}
	
	public String createFile(String fileName){
		this.filePointer = new File(this.currentDirectory + fileName);
		try {
		  if (filePointer.createNewFile()) {
		        return "File created: " + filePointer.getName();
		      } else {
		        return fileName+" Already Present";
		  }
		} catch(Exception exception) {
			return exception.getMessage();
		}
		
	}
	
	  public String deleteFile(String fileName) { 
		  this.filePointer = new File(this.currentDirectory + fileName); 
		    if (this.filePointer.delete()) { 
		      return "Deleted the file: " + this.filePointer.getName();
		    } else {
		      return "Failed to delete the file.";
		    } 
	  }
	  
	  public void listAllFiles() {
		  File fileDir = new File(this.currentDirectory);

		  String[] files = fileDir.list();
		  Arrays.sort(files);
		  System.out.println("Listing all the files in the directory");
		  for(String file: files) {
			  System.out.println("-> "+file);
		  }
		  System.out.println(" \n ");
		  
	  }
	  
	  public void searchFiles(String filename) {
		  File fileDir = new File(this.currentDirectory);

		  String[] files = fileDir.list();

		  System.out.println(" \n ");
		  System.out.println("Showing files matching the search keyword ... ");
		  for(String file: files) {
			  if(file.contains(filename)) {
				  System.out.println("-> "+file);
			  }
		  }
		  System.out.println(" \n ");
		  
	  }

	
	
}
