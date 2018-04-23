package first;

import java.io.File;

public class ex5_CheckFileOrDirectory {
	public static void main(String[] args) {
		File file = new File("D:\\JAVA\\javaIO\\file\\1.txt");
		if(file.isDirectory()) {
			System.out.println("this is directory");
		}
		if(file.isFile()) System.out.println(" this is file");
	}
}
