package Module3;
import java.io.*;
public class Myfile4 {
		    public static void main(String[] args) throws IOException {
		        File f1 = new File("file1.txt");
		        System.out.println("File created");
		        FileWriter fw = new FileWriter("file1.txt");
		        fw.write("Hello welcome to java programming");
		        fw.close(); 
		        File f2 = new File("file2.txt");
		        System.out.println("File created");
		        FileWriter fr = new FileWriter("file2.txt"); 
		        fr.close(); 
		        System.out.println("File created at: " + f1.getAbsolutePath());
		        System.out.println("File created at: " + f2.getAbsolutePath());
		        try {
		            if (f1.exists() && f2.exists()) {
		                System.out.println("File1 exists...");
		                System.out.println("File2 exists...");
		                FileInputStream fi = new FileInputStream("file1.txt");
		                FileOutputStream fo = new FileOutputStream("file2.txt");
		                int c;
		                while ((c = fi.read()) != -1) {
		                    fo.write(c);  
		                }
		                fi.close();
		                fo.close();
		                System.out.println("File contents copied from file1 to file2");
		            }
		            FileReader fd = new FileReader("file1.txt");
		            int i;
		            System.out.println("File contents of file1");
		            while ((i = fd.read()) != -1) {
		                System.out.print((char) i);  
		            }
		            fd.close();
		            FileReader fd2 = new FileReader("file2.txt");
		            System.out.println("\n*File contents of file2*"); 
		            while ((i = fd2.read()) != -1) {
		                System.out.print((char) i);  
		            }
		            fd2.close();  
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
}
		 