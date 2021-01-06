package ticketBoothP;
import java.util.Scanner;

public class TicketBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketBooth tick = new TicketBooth();
		System.out.println("ColganBoothNow          [[CCHS 2020 NOT TRADEMARKED (Unofficial, Unapproved Program)]]");
		System.out.println("Welcome to the Colgan HS Ticket Booth.");
		System.out.println(""); // spacer	
		System.out.println(""); // spacer
		
		tick.name();
	}
	
	public static String loopPassword() {
		String password = "";
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		int rand = 0;
		int counter = 0;
		
		while(counter < 8) {
		rand = (int) (Math.random() * characters.length());
		password += characters.substring(rand, rand + 1);
		counter = counter + 1;
		}
		return password;
	}
	
	public static String generate() {
		// generate the first character of a randomized password
		String password = "";
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		int rand = (int) (Math.random() * characters.length());
		password += characters.substring(rand, rand + 1);
		
		rand = (int) (Math.random() * characters.length());
		password += characters.substring(rand, rand + 1);
		
		rand = (int) (Math.random() * characters.length());
		password += characters.substring(rand, rand + 1);
		
		rand = (int) (Math.random() * characters.length());
		password += characters.substring(rand, rand + 1);
		
		rand = (int) (Math.random() * characters.length());
		password += characters.substring(rand, rand + 1);
		
		rand = (int) (Math.random() * characters.length());
		password += characters.substring(rand, rand + 1);
		
		rand = (int) (Math.random() * characters.length());
		password += characters.substring(rand, rand + 1);
		
		rand = (int) (Math.random() * characters.length());
		password += characters.substring(rand, rand + 1);
		return password;
	}
	
	public void name() {
		boolean loop = true;
		while(loop == true) {
		Scanner uInput = new Scanner(System.in);
		//boolean looper = true; // assists in looping back to the beginning for the user to reselect if answer is wrong
		String studentClass; // stores user input for grade class
		
		System.out.println("Please enter your first name and last name.");
		String studentName = uInput.nextLine(); // stores user input for name
		System.out.println("Name: " + studentName); // verifies the name by reading the input out
		
		
		
		//while(looper) { // loops back around if the user doesn't select a listed answer
			System.out.println("Please select your Grade Classification. (Please Select a Letter.) ");
			System.out.println("Freshman (A), Sophomore (B), Junior (C), Senior (D)");
			studentClass = uInput.nextLine(); // stores user input for grade class
			
		if(studentClass.equals("A") || studentClass.equals("a")) {
			System.out.println("Your Selection: Freshman (A)"); // verifies the class by reading the input out
			//looper = false;
			
		}
		else if(studentClass.equals("B") || studentClass.equals("b")) {
			System.out.println("Your Selection: Sophomore (B)");
			//looper = false;
		}
		else if(studentClass.equals("C") || studentClass.equals("c")) {
			System.out.println("Your Selection: Junior (C)");
			//looper = false;
		}
		else if(studentClass.equals("D") || studentClass.equals("d")) {
			System.out.println("Your Selection: Senior (D)");
			//looper = false;
		}
		else {
			System.out.println("Please select another answer.");
			//looper = true;
		}
		//}
		
		
		System.out.println("");
		
		System.out.println("Which ticket would you like? (Please Select a Letter.)"); // shows available options for the user to select
		System.out.println("");
		System.out.println("Tickets Available:");
		
		if(studentClass.equals("A") || studentClass.equals("a")) {
			System.out.println("A {Solo}  1 Person | $65.00");
			System.out.println("B {Couple}  2 People | $98.00");
			System.out.println("C {Group}  3-4 People | $163.00");
			
		}
		else if(studentClass.equals("B") || studentClass.equals("b")) {
			System.out.println("A {Solo}  1 Person | $55.00");
			System.out.println("B {Couple}  2 People | $83.00");
			System.out.println("C {Group}  3-4 People | $138.00");
			
		}
		else if(studentClass.equals("C") || studentClass.equals("c")) {
			System.out.println("A {Solo}  1 Person | $45.00");
			System.out.println("B {Couple}  2 People | $68.00");
			System.out.println("C {Group}  3-4 People | $113.00");
			
		}
		else if(studentClass.equals("D") || studentClass.equals("d")) {
			System.out.println("A {Solo}  1 Person | $40.00");
			System.out.println("B {Couple}  2 People | $60.00");
			System.out.println("C {Group}  3-4 People | $100.00");
			
		}
		else {
			System.out.println("Please try again.");
			
		}
		
		String ticketType = uInput.nextLine(); // stores user input for the ticket type
		
		
		
		if((studentClass.equals("A") || studentClass.equals("a")) && (ticketType.equals("A") || ticketType.equals("a"))) {
			System.out.println(studentName + " purchased a Freshman Solo ticket for $65.00. The confirmation number for this sale is " + loopPassword());
		}
		
		else if((studentClass.equals("A") || studentClass.equals("a")) && (ticketType.equals("B") || ticketType.equals("b"))) {
			System.out.println(studentName + " purchased a Freshman Couple ticket for $98.00. The confirmation number for this sale is " + loopPassword());
		}
		
		else if((studentClass.equals("A") || studentClass.equals("a")) && (ticketType.equals("C") || ticketType.equals("c"))) {
			System.out.println(studentName + " purchased a Freshman Group ticket for $163.00. The confirmation number for this sale is " + loopPassword());
		}
		
		else if((studentClass.equals("B") || studentClass.equals("b")) && (ticketType.equals("A") || ticketType.equals("a"))) {
			System.out.println(studentName + " purchased a Sophomore Solo ticket for $55.00. The confirmation number for this sale is " + loopPassword());
		}
		
		else if((studentClass.equals("B") || studentClass.equals("b")) && (ticketType.equals("B") || ticketType.equals("b"))) {
			System.out.println(studentName + " purchased a Sophomore Couple ticket for $83.00. The confirmation number for this sale is " + loopPassword());
		}
		
		else if((studentClass.equals("B") || studentClass.equals("b")) && (ticketType.equals("C") || ticketType.equals("c"))) {
			System.out.println(studentName + " purchased a Sophomore Group ticket for $138.00. The confirmation number for this sale is " + loopPassword());
		}
		
		else if((studentClass.equals("C") || studentClass.equals("c")) && (ticketType.equals("A") || ticketType.equals("a"))) {
			System.out.println(studentName + " purchased a Junior Solo ticket for $45.00. The confirmation number for this sale is " + loopPassword());
		}
		
		else if((studentClass.equals("C") || studentClass.equals("C")) && (ticketType.equals("B") || ticketType.equals("c"))) {
			System.out.println(studentName + " purchased a Junior Couple ticket for $68.00. The confirmation number for this sale is " + loopPassword());
		}
		
		else if((studentClass.equals("C") || studentClass.equals("c")) && (ticketType.equals("C") || ticketType.equals("c"))) {
			System.out.println(studentName + " purchased a Junior Group ticket for $113.00. The confirmation number for this sale is " + loopPassword());
		}
		
		else if((studentClass.equals("D") || studentClass.equals("d")) && (ticketType.equals("A") || ticketType.equals("a"))) {
			System.out.println(studentName + " purchased a Senior Solo ticket for $40.00. The confirmation number for this sale is " + loopPassword());
		}
		
		else if((studentClass.equals("D") || studentClass.equals("d")) && (ticketType.equals("B") || ticketType.equals("b"))) {
			System.out.println(studentName + " purchased a Senior Couple ticket for $60.00. The confirmation number for this sale is " + loopPassword());
		}
		
		else if((studentClass.equals("D") || studentClass.equals("d")) && (ticketType.equals("C") || ticketType.equals("c"))) {
			System.out.println(studentName + " purchased a Senior Group ticket for $100.00. The confirmation number for this sale is " + loopPassword());
		}
		else {
			System.out.println("Please Try again.");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Would you like to make another transaction? \"Yes\" to continue, any other key to quit.");
		String finalTransaction = uInput.nextLine();
		if(finalTransaction.equals("Yes") || finalTransaction.equals("yes") || finalTransaction.equals("Y") || finalTransaction.equals("y")) {
			loop = true;
		}
		else {
			System.out.println("Session Terminated.");
			loop = false;
		}
		}
	}
}
