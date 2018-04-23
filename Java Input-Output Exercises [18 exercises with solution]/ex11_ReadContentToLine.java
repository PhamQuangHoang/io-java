package first;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex11_ReadContentToLine {
   public static void main(String[] args) throws IOException {
	   BufferedReader bf = null;
	 File file = new File("D:\\JAVA\\javaIO\\file\\1.txt");
	 try {
		 FileInputStream ip = new FileInputStream(file);
		  bf = new BufferedReader(new InputStreamReader(ip));
		 if(file.exists()) {
			 if(file.canRead()) {
				 String line;
				 while((line=bf.readLine())!=null) {
					 line=line.trim();
					 if(line!=null&&!line.isEmpty()) System.out.println("the content is "+line);
				 }
			 }
		 }
		
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		if(bf!=null) {
			bf.close();
			
		}
	}
}
}
