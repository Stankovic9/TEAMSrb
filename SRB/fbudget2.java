import java.time.temporal.TemporalUnit;
import java.util.*;
public class fbudget2 {
	static Person andy = new Person("Son", "Andy", 2000);
	static Person anna = new Person("Mother", "Anna", 5000);
	static Person vlad = new Person("Father", "Vlad", 9000);
	static Scanner scan = new Scanner(System.in);

	public static void main(String [] args){

		String temp1;
		String temp2;
		Person personSelected = null;
		
		boolean bDoWhile = true;
		while( bDoWhile ) {

			// 1) Select person
			personSelected = null;

			boolean bSelectedPerson = false;
			while ( !bSelectedPerson ) {
				//PRINTING OUT FAMILY MEMBERS ACCOUNTS
				System.out.println("----------------------------");
				System.out.println("Family member #1: " + andy);
				System.out.println("Family member #2: " + anna);
				System.out.println("Family member #3: " + vlad);
				System.out.println("EXIT to leave appliction");
				System.out.println("----------------------------");

				// SCANNING WHICH MEMBER YOU WANT TO USE 
				System.out.println("Who are you? ");
				temp1 = scan.nextLine();
				if (temp1.equals(andy.getName())){
					personSelected = andy;
					bSelectedPerson = true;
				} 
				else if (temp1.equals(anna.getName())){
					personSelected = anna;
					bSelectedPerson = true;
				} 
				else if (temp1.equals(vlad.getName())){
					personSelected = vlad;
					bSelectedPerson = true;
				} 
				else if (temp1.equals("EXIT")){
					personSelected = null;
					System.exit(1);
				} 
				else {
					System.out.println("Didn't choose the right name. Select again or type EXIT to leave application");
					personSelected = null;
					bSelectedPerson = false;
				}
			}

			boolean bGoBackSelected = false;
			boolean bSelectedAction = false;
			while ( !bSelectedAction ) {
				System.out.println("What do you want to do for " + personSelected.getName() + "? ADD, WITHDRAW, CLEAR, GO BACK, EXIT ");
				temp2 = scan.nextLine();

				if (temp2.equals("ADD")){
					add(personSelected);
					bSelectedAction = true;
				} 
				else if (temp2.equals("WITHDRAW")){
					withdraw(personSelected);
					bSelectedAction = true;
				} 
				else if (temp2.equals("CLEAR")){
					clear(personSelected);
					bSelectedAction = true;
				} 
				else if (temp2.equals("GO BACK")){
					// go to the begin
					bGoBackSelected = true;
					bSelectedAction = true;
				}
				else if (temp2.equals("EXIT")){
					bSelectedAction = true;
					System.exit(1);
				}
				else {
					bSelectedAction = false;
					System.out.println("You didn't choose an action");
				}
			}

			if ( bGoBackSelected )
				continue;

			// print new balance
			System.out.println("");
			System.out.println("New balance is " + personSelected);
			System.out.println("");
		}
	}

	private static void add(Person person) {
		System.out.println("How much would you like to add?");
		int money = scan.nextInt();
		person.add(money);
		scan.nextLine();
	}

	private static void withdraw(Person person) {
		System.out.println("How much would you like to withdraw?");
		int money = scan.nextInt();
		person.withdraw(money);
		scan.nextLine();
	}

	private static void clear(Person person) {
		System.out.println("Your budget is now cleared and is 0");
		person.clear();
	}
}