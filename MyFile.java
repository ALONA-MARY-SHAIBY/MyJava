package Module3;
import java.io.*;
import java.util.Scanner;
public class MyFile {

	public static void main(String[] args) throws IOException {
		File f=new File("Words.txt");
		System.out.println("File created");
		FileWriter fw=new FileWriter("Words.txt");
		String content="Hello welcome to the world of java programming.\n";
		fw.write(content);
		fw.close();
		FileReader fr =new FileReader("Words.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int lcount = 0;
        
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            lcount++;
        }
        
        br.close();
        System.out.println("No of lines: " + lcount);
    }
}

