package first;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ex17 {
 public static void main(String[] args) {
	        BufferedReader br = null;
	        String strLine = "";
	        try {
	            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("D:\\JAVA\\javaIO\\file\\1.txt"), "UTF8"));
	             while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3){
	                System.out.println(strLine);
	            }
	           reader.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file.");
	        }
	     }
}
