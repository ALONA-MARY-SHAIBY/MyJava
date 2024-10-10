package LAB2024;
import java.io.*;
import java.util.Scanner;
public class Myfile {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		try {
		File f=new File("Sample.txt");
		System.out.println("File created");
		if(f.createNewFile()) {
			System.out.println("File created");
		}
		else {
			System.out.println("File exist");
		}
		String content;
		System.out.println("Enter the content:");
		content=sc.nextLine();
		FileWriter fw=new FileWriter("Sample.txt");
		fw.write(content);
		System.out.println("Content written to file");
		fw.close();
		FileReader fr=new FileReader("Sample.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char) i);
		}
		fr.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			}
		//create new-sample.txt
		File f1=new File("new-Sample.txt");
		System.out.println("\nFile created");
		if(f1.createNewFile()) {
			System.out.println("File created");
		}
		else {
			System.out.println("File exist");
		}
		FileReader fr1=new FileReader("Sample.txt");
		FileWriter fw1=new FileWriter("new-Sample.txt");
		int i;
		try {
			while((i=fr1.read())!=-1) {
			fw1.write(i);
			}
			System.out.println("Copied");
		fr1.close();
		fw1.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
			}
	FileReader fr2=new FileReader("new-Sample.txt");
	while((i=fr2.read())!=-1) {
		System.out.print((char) i);
	}
	fr2.close();
	}
	}

