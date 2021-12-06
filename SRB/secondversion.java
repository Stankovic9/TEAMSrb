import java.time.temporal.TemporalUnit;
import java.util.*;
public class secondversion {
        static String temp1;
        static String temp2;
        

        static Person andy = new Person("Son", "Andy", 2000);
        static Person anna = new Person("Mother", "Anna", 5000);
        static Person vlad = new Person("Father", "Vlad", 9000);
        static Person temporary = new Person();
        static Person [] family = {andy,anna,vlad};
        static int f;
        static Scanner scan = new Scanner(System.in);

    public static void main(String [] args){
        run();
    }

    public static void run(){


        //PRINTING OUT FAMILY MEMBERS ACCOUNTS
        System.out.println("Family member #1: " + andy);
        System.out.println("Family member #2: " + anna);
        System.out.println("Family member #3: " + vlad);
        System.out.println("----------------------------------------------------------");

        // SCANNING WHICH MEMBER YOU WANT TO USE 
        System.out.println("Who are you? ");
        temp1 = scan.nextLine();
        if (temp1.equals(andy.getName())){
            f = 0;
        } else if (temp1.equals(anna.getName())){
            f = 1;
        } else if (temp1.equals(vlad.getName())){
            f = 2;
        } else {
            System.out.println("Didn't choose the right name.");
            run(andy,anna,vlad);
        }

        chooseName(family[f]);
  
        temp2 = scan.nextLine();

        if (temp2.equals("ADD")){
            add(family[f]);
        } else if (temp2.equals("WITHDRAW")){
            withdraw(family[f]);
        } else if (temp2.equals("CLEAR")){
            clear(family[f]);
        } else {
            System.out.println("You didn't choose an action");
            run(andy,anna,vlad);
        }
        run(andy,anna,vlad);       
            
}
public static void run(Person andy, Person anna, Person vlad){

    temp1 = "";
    temp2 = "";


    //PRINTING OUT FAMILY MEMBERS ACCOUNTS
    System.out.println("Family member #1: " + andy);
    System.out.println("Family member #2: " + anna);
    System.out.println("Family member #3: " + vlad);
    System.out.println("----------------------------------------------------------");

    // SCANNING WHICH MEMBER YOU WANT TO USE 
    System.out.println("Who are you? ");
    String temporary = scan.nextLine();
    System.out.print(temporary);
    temp1 = scan.nextLine();

    if (temp1.equals(andy.getName())){
        f = 0;
    } else if (temp1.equals(anna.getName())){
        f = 1;
    } else if (temp1.equals(vlad.getName())){
        f = 2;
    } else {
        System.out.println("Didn't choose the right name.");
        run(andy,anna,vlad);
    }

    chooseName(family[f]);

    temp2 = scan.nextLine();

    if (temp2.equals("ADD")){
        add(family[f]);
    } else if (temp2.equals("WITHDRAW")){
        withdraw(family[f]);
    } else if (temp2.equals("CLEAR")){
        clear(family[f]);
    } else {
        System.out.println("You didn't choose an action");
        run(andy,anna,vlad);
    }
    run(andy,anna,vlad);
        
}


    private static void clear(Person person) {
        System.out.println("Your budget is now cleared and is 0");
        family[f].clear();
    }


    private static void withdraw(Person person) {
        System.out.println("How much would you like to withdraw?");
        int money = scan.nextInt();
        family[f].withdraw(money);
    }


    private static void add(Person person) {
        System.out.println("How much would you like to add?");
        int money = scan.nextInt();
        family[f].add(money);
    }


    public static void chooseName(Person temp){
            System.out.println("What do you want to do " + temp.getName() + "? ADD, WITHDRAW, CLEAR, GO BACK ");
    }
}