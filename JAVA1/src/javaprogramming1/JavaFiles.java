package javaprogramming1;

import java.io.File;
import java.io.IOException;

public class JavaFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		      File myObj = new File("filename1.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  
	}

}
