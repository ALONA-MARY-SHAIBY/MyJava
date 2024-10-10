package Module3;
import java.util.Scanner;
 class InvalidReservationException extends Exception{
    private String message;   
    public InvalidReservationException(String msg) {
        message = msg;
    }
    public String getMessage() {
        return message;
    }
}
public class HotelRoom {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter slot no:");
	int slot=sc.nextInt();
	try {
		if(slot<=0) {
			throw new InvalidReservationException("Invalid slot no...");
		}
		else {
			System.out.println("Your slot is registered");
		}
	}
	catch(InvalidReservationException e) {
		System.out.println(e.getMessage());
	}
	

	}

}
