package first;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ex12 {
	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder();
			String str = "";
			try {
				BufferedReader bf = new BufferedReader(new FileReader("D:\\JAVA\\javaIO\\file\\1.txt"));
				while(str!=null) {
					sb.append(str);
					sb.append(System.lineSeparator());
					str =bf.readLine();
					System.out.println(str);
				}
				bf.close();
				
				
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				System.err.println("file not found");
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	
	 
}
}
