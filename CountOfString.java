package java10;
import java.util.Scanner;
public class CountOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the string:");
		str=sc.nextLine();
		int len,ch=0,w=0,l=0,al=0,d=0,ws=0,spcl=0;
		len=str.length();
		str=str.toLowerCase();
		for(int i=0;i<len;i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				al++;
			}
			else if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				d++;
			}
			else if(str.charAt(i)==' ') {
				ws++;
			}
			else if(str.charAt(i)=='\n') {
				l++;
			}
			else {
				spcl++;
			}
		}
			ch=d+al+spcl;
			l=l+1;
			w=ws+1;
			System.out.println("Total no of characters:"+ch);
			System.out.println("Total no of words:"+w);
			System.out.println("Total no of lines:"+l);
			System.out.println("Total no of alphabets:"+al);
			System.out.println("Total no of digits:"+d);
			System.out.println("Total no of white spaces:"+ws);
			
			
			
		}
		

	}


