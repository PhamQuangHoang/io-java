package first;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ex13 {
  public static void main(String[] args) {
	String str = "";
    String data = "";	  
	  try {
		BufferedReader bf = new BufferedReader(new FileReader("D:\\JAVA\\javaIO\\file\\1.txt"));
		  while (str != null)
          {
             
             data += str;
             str = bf.readLine();
             
         }	
		  System.out.println(data);
		bf.close();
		
	} catch (IOException e) {
e.printStackTrace();
		
		// TODO: handle exception
	}
	  
	  
}
}
