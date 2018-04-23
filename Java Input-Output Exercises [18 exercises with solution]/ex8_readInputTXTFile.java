package first;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex8_readInputTXTFile {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("D:\\JAVA\\javaIO\\file\\1.txt"));
			BufferedReader bf = new BufferedReader(new InputStreamReader(fis));
			String text=bf.readLine();
			if(text!=null) {
				System.out.println("the text in this file is "+ text);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
