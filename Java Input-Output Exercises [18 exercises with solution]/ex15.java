package first;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex15 {
 public static void main(String[] args) {
     StringBuilder sb = new StringBuilder();
     String strLine = "";
     try
       {
          String filename= "/home/students/myfile.txt";
          FileWriter fw = new FileWriter(filename,false); 
          //appends the string to the file
          fw.write("Python Exercises\n");
          fw.close();
          BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\javaIO\\file\\1.txt"));
          //read the file content
          while (strLine != null)
          {
             sb.append(strLine);
             sb.append(System.lineSeparator());
             strLine = br.readLine();
             System.out.println(strLine);
         }
          br.close();                          
        }
        catch(IOException ioe)
        {
         System.err.println("IOException: " + ioe.getMessage());
        }
     }
}
