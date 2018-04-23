package first;

import java.io.File;

public class ex4_CheckFileOrDirCanReadOrWrite {
	public static void main(String[] args) {
         File file = new File("D:");
         if(file.canRead()) {
        	 System.out.println(file.getAbsolutePath()+" can read");
         }else {
        	 System.out.println(file.getAbsolutePath()+"can't read");
         }
         if(file.canWrite()) {
        	 System.out.println(file.getAbsolutePath()+"can write\n");
         }else System.out.println(file.getAbsolutePath()+"can not write");
	}
}
