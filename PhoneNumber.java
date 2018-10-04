/**
 * 
 * @author Roon
 *
 */
import java.util.Scanner;
public class PhoneNumber 
{

	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			
			System.out.print("Please enter your name: ");
			String name= in.next();
			in.nextLine();
			System.out.print("Hi " + name + ", please enter your phone number with no spaces or dashes:");
			String phoneNumber = in.next();
			in.nextLine();
			String areaCode = phoneNumber.substring(0, 3);
			String nextThree = phoneNumber.substring(3, 6);
			String lastFour = phoneNumber.substring(6);
			String fNumber = ("(" + areaCode + ") " + nextThree + "-" + lastFour);
			System.out.printf("%-20s %s", "Name: " + name, "Phone #: " + fNumber);
	}
}