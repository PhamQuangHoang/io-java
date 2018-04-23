package first;

import java.io.File;

public class ex3_CheckFileOrDirisExist {
	public static void main(String[] args) {
        File file = new File("D:\\JAVA\\javaIO\\file\\1.txt");
        if(file.exists()) {
        	System.out.println(file.getName()+" is exist\n");
        	
        }else {
        	System.out.println(" it not exist");
        }
        
	}
}
