package first;

import java.io.File;

public class Rename {
	public static void main(String[] args) {
		File file = new File("D:\\JAVA\\javaIO\\file\\5.txt");
		File file2 = new File("D:\\JAVA\\javaIO\\file\\1.txt");
        boolean rename = file.renameTo(file2);
        if(rename==true) {
        	System.out.println(" success ");
        	
        }else {
        	System.out.println(" unsuccess");
        }
	
	}
}
