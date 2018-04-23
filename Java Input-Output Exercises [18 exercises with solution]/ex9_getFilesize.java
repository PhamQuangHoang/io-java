package first;

import java.io.File;

public class ex9_getFilesize {
	public static void main(String[] args) {
		File file = new File("D:\\JAVA\\javaIO\\file\\1.txt");
		if(file.exists()) {
			System.out.println(file.length());
		}
	}
}
