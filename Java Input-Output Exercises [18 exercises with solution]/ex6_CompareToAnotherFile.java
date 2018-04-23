package first;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex6_CompareToAnotherFile {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\JAVA\\javaIO\\file\\1.txt");
		String a="123";
		try {
			FileInputStream fis  = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String line;
			while((line=br.readLine())!=null) {
				line= line.trim();
				if(line!=null&&!line.isEmpty()) {
					System.out.println("the text in file"+line);
				}
				if(line.compareTo(a)==0) {
					System.out.println(" the same text");
				}
				
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
