package java10;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		String str1;
		System.out.println("Enter the word:");
		str1=sc.nextLine();
		int len=str1.length();
		System.out.println("Length is:" + len);
		for(int i=0;i<len/2;i++) {
			if(str1.charAt(i)!=str1.charAt(len-i-1)) {
				flag=false;
				break;
			}
		}
			if(flag==true) {
				System.out.println( str1 + " " + "Is a palindrome");
			}
			else {
				System.out.println(str1 + " " + "Not a palindrome");
			}
		}

	}


