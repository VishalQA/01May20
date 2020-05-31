package javaprogramming1;


//try {
//    File myObj = new File("filename1.txt");
//    if (myObj.createNewFile()) {
//      System.out.println("File created: " + myObj.getName());
//    } else {
//      System.out.println("File already exists.");
//    }
//  } catch (IOException e) {
//    System.out.println("An error occurred.");
//    e.printStackTrace();
//  }
//
//}
//
//}

import java.io.File;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class JavaFile_Write {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}