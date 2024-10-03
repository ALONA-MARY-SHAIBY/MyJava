package LAB2024;
import java.util.Scanner;
class AccDetails{	
	int Accno,ib;
	String Acctyp,name;
	void Openacc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account no:");
		Accno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Account type:");
		Acctyp=sc.nextLine();
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter initial balance:");
		ib=sc.nextInt();
		System.out.println("Account created successfully!");
	}
	void Displayacc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Account no:"+Accno);
		System.out.println("Account type:"+Acctyp);
		System.out.println("Name:"+name);
		System.out.println("Initial balance:"+ib);
	}
	void Depositacc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to deposit:");
		int dp=sc.nextInt();
		try {
			if(dp<=0) {
				throw new InvalidAmountException("Invalid Amount; must be greater than 0");
			}
			ib+=dp;
			System.out.println("Deposit Successfull! New Balance:"+ib);
		}
		catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
	}
	void Withdrawacc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount to withdraw :");
		int withamo=sc.nextInt();
		try {
			if(withamo<=0) {
						throw new InvalidAmountException("Invalid Amount; must be greater than 0");
					}
			else if(withamo>ib) {
						throw new InsufficientAmountException("Insufficient balance for withdrawal.");
					}
			else {
					ib-=withamo;
					System.out.println("Withdrawal Successfull! New Balance:"+ib);
				}
			}
		catch(InvalidAmountException e) {
					System.out.println(e.getMessage());
				}
				catch(InsufficientAmountException e) {
					System.out.println(e.getMessage());
				}
			}
	void Searchacc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account no to search:");
		int sacc=sc.nextInt();
		System.out.println("Account no:"+Accno);
		System.out.println("Account type:"+Acctyp);
		System.out.println("Name:"+name);
		System.out.println("Initial balance:"+ib);
	}
	void exit() {
		System.out.println("Thank you for using the banking system..see you soon!\n************\nThanku:) Visit again\n********");
	}
}
public class MyCustomBank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccDetails ac=new AccDetails();
		String ch;
		do {
	System.out.println("*** Banking System Application***");
	System.out.println("1.Open New Account");
	System.out.println("2.Display Account Details");
	System.out.println("3.Deposit Amount");
	System.out.println("4.Withdraw Amount");
	System.out.println("5.Search Account");
	System.out.println("6.Exit");
	System.out.println("Enter your choice:");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		ac.Openacc();
		break;
	case 2:
		ac.Displayacc();
		break;
	case 3:
		ac.Depositacc();
		break;
	case 4:
		ac.Withdrawacc();
		break;
	case 5:
		ac.Searchacc();
		break;
	case 6:
		ac.exit();
	default:
			System.out.println("Invalid");
	}
	System.out.println("Do you want to continue(y/n):");
     ch=sc.next();
	}
	while(ch.equalsIgnoreCase("y"));
	sc.close();
	}
}
