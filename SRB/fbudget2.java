import java.util.*;
public class fbudget2 {

    public static void main(String [] args){

        String temp1;
        String temp2;
        String temp3;

        Person andy = new Person("Son", "Andy", 2000);
        Person anna = new Person("Mother", "Anna", 5000);
        Person vlad = new Person("Father", "Vlad", 9000);

        Person[] family = {andy,anna,vlad};

        Scanner scan = new Scanner(System.in);

        //PRINTING OUT FAMILY MEMBERS ACCOUNTS
        System.out.println("Family member #1: " + andy);
        System.out.println("Family member #2: " + anna);
        System.out.println("Family member #3: " + vlad);
        System.out.println("----------------------------------------------------------");

        // SCANNING WHICH MEMBER YOU WANT TO USE 
        System.out.print("Who are you? ");
        temp1 = scan.nextLine();

        //IF STATMENT FOR CHOSING THE ACCOUNT
        if(temp1.equals(andy.getName())){
            
}
}
}