import java.util.*;
public class FBudget{

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
            System.out.println("----------------------------------------------------------");
            System.out.println(andy);
            System.out.println("What do you want to do Andy? ADD, WITHDRAW, CLEAR, GO BACK ");
            temp2 = scan.nextLine();
            if(temp2.equals("ADD")){
                System.out.print("How much do you want to add? ");
                temp3 = scan.nextLine();
                andy.add(Integer.valueOf(temp3));
                System.out.println(andy);

            }
            else if(temp2.equals("WITHDRAW")){
                System.out.print("How much do you want to withdraw? ");
                temp3 = scan.nextLine();
                andy.withdraw(Integer.valueOf(temp3));
                System.out.println(andy);
            }
            else if(temp2.equals("CLEAR")){
                andy.clear();
                System.out.println(andy);   
            }
            else if(temp2.equals("GO BACK")){
                
            }
               
        }
        else if(temp1.equals(anna.getName())){
            System.out.println("----------------------------------------------------------");
            System.out.println(anna);
            System.out.println("What do you want to do Anna? ADD, WITHDRAW, CLEAR, GO BACK ");
            temp2 = scan.nextLine();
            if(temp2.equals("ADD")){
                System.out.print("How much do you want to add? ");
                temp3 = scan.nextLine();
                anna.add(Integer.valueOf(temp3));
                System.out.println(anna);

            }
            else if(temp2.equals("WITHDRAW")){
                System.out.print("How much do you want to withdraw? ");
                temp3 = scan.nextLine();
                anna.withdraw(Integer.valueOf(temp3));
                System.out.println(anna);
            }
            else if(temp2.equals("CLEAR")){
                anna.clear();
                System.out.println(anna);
            }
            else if(temp2.equals("GO BACK")){
                
            }
        }
        else if(temp1.equals(vlad.getName())){
            System.out.println("----------------------------------------------------------");
            System.out.println(vlad);
            System.out.println("What do you want to do Vlad? ADD, WITHDRAW, CLEAR, GO BACK ");
            temp2 = scan.nextLine();
            if(temp2.equals("ADD")){
                System.out.print("How much do you want to add? ");
                temp3 = scan.nextLine();
                vlad.add(Integer.valueOf(temp3));
                System.out.println(vlad);

            }
            else if(temp2.equals("WITHDRAW")){
                System.out.print("How much do you want to withdraw? ");
                temp3 = scan.nextLine();
                vlad.withdraw(Integer.valueOf(temp3));
                System.out.println(vlad);
            }
            else if(temp2.equals("CLEAR")){
                vlad.clear();
                System.out.println(vlad);
            }
            else if(temp2.equals("GO BACK")){
                
            }
        }
        else{
            System.out.println("This member does not exist");
        }
    }
}