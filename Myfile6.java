package Module3;
import java.io.*;
public class Myfile6 {
	public static void main(String[] args) {
	try {
		FileInputStream fin=new FileInputStream("Words.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fin));
	    String line;
	    int lineno=1;
	    while((line=br.readLine())!=null) {
	    	System.out.println(lineno+":"+line);
	    	lineno++;
	    }
	    br.close();
	    }
	catch(Exception e) {
		System.out.println("An error occured:"+e.getMessage());
	}
}
}