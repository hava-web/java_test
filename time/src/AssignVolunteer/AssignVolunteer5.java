package AssignVolunteer;
import java.util.Scanner;

public class AssignVolunteer5 {
   public static void main(String[] args) {
	int donationType;
	String volunteer;
	String message;
	final int CLOTHING_CODE = 1;
    final int FURNITURE_CODE = 2;
    final int ELECTRONIC_CODE = 3;
    final int OTHER_CODE = 4;
	final String CLOTHING_PRICER = "Regina";
	final String OTHER_PRICER = "Marco";
	final String FURNITURE_PRICE = "Walter";
	final String ELECTRONIC_PRICE = "Lydia";
	Scanner inputScanner = new Scanner(System.in);
    System.out.println("Enter an integer...");
	donationType = inputScanner.nextInt();
	while(donationType < CLOTHING_CODE || donationType > OTHER_CODE)
	{
		System.out.println("You entered "+ donationType + " which is not a valid donation type");
		System.out.println("Please enter a value between "+CLOTHING_CODE+ " and "+OTHER_CODE);
		System.out.println("Enter an integer: ");
		donationType = inputScanner.nextInt();
	}
	switch (donationType) {
	case(CLOTHING_CODE):
	{
		volunteer = CLOTHING_PRICER;
		message = "a clothing donation";
		break;
	}
	case(FURNITURE_CODE):
	{
		volunteer = FURNITURE_PRICE;
		message = "a furniture donation";
		break;
	}
	case(ELECTRONIC_CODE):
	{
		volunteer = ELECTRONIC_PRICE;
		message = "a electronic donation";
		break;
	}
	case(OTHER_CODE):
	{
		volunteer = OTHER_PRICER;
		message = "another donation type";
		break;
	}
	default:
		volunteer = "invalid";
		message = "an invalid donation type";
	}
	System.out.println("You entered " + donationType);
	System.out.println("This is " + message);
	System.out.println("The volunteer who will price this item is " + volunteer);
}
}
