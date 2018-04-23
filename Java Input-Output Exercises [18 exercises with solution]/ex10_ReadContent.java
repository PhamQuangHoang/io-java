package first;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ex10_ReadContent {
     public static void main(String[] args) throws IOException {
    	 
		try {
			FileInputStream ip = new FileInputStream(new File("D:\\JAVA\\javaIO\\file\\1.txt"));
            byte File_content[] = new byte[2*1024];
            int read_count=0;
            while((read_count=ip.read(File_content))>0) {	
            	System.out.println( new String(File_content,0,read_count+1)); 
            	
            }
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	 
    	 
	}
}
