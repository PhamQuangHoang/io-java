package first;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class EX14 {
public static void main(String[] args) {
	String line = "";
	ArrayList<String> list = new ArrayList<String>();
	try {
		BufferedReader br = new BufferedReader(new FileReader("D:\\JAVA\\javaIO\\file\\1.txt"));
		while(line!=null) {
           line = br.readLine();
           if(line==null) break;
        	   list.add(line);
		}
		System.out.println(Arrays.toString(list.toArray()));
		br.close();
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
