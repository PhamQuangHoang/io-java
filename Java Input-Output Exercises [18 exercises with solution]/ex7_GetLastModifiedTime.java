package first;

import java.io.File;
import java.util.Date;

public class ex7_GetLastModifiedTime {
   public static void main(String[] args) {
	File file = new File("D:\\JAVA\\javaIO\\file\\1.txt");
	if(file.exists()) {
		Long LastModifie = file.lastModified();
		Date lasmodifieDate = new Date(LastModifie);
		System.out.println(lasmodifieDate);
	}
}
}
