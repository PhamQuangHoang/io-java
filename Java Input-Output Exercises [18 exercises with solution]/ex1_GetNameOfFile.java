package first;

import java.io.File;

public class ex1_GetNameOfFile {
public static void main(String[] args) {
	 String src = "";
	 File  file = new File("D:\\JAVA\\javaIO\\file");
	 String[] filelist = file.list();
	 for(String name:filelist) {
		 System.out.println( name);
	 }
}
}
