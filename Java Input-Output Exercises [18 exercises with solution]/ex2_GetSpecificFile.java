package first;

import java.io.File;
import java.io.FilenameFilter;

public class ex2_GetSpecificFile {
	public static void main(String[] args) {
          File file = new File("D:\\JAVA\\javaIO\\file");
          String[] list =file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
                   if(name.toLowerCase().endsWith(".txt")) {
                	   // loc ra cac file co' duoi la .txt ke ca folder
                	   return true;
                   }else
				
				return false;
			}
		});
          for(String f:list) {
        	  System.out.println(f);
          }
	}
}
