import java.util.*;
public class FBudget{

    public static void main(String [] args){

        String temp;

        Person andy = new Person("Son", "Andy", 2000);
        Person anna = new Person("Mother", "Anna", 5000);
        Person vlad = new Person("Father", "Vlad", 9000);

        Person[] family = {andy,anna,vlad};

        Scanner scan = new Scanner(System.in);

        System.out.println("Who are you?");
        temp = scan.nextLine();

        if(temp.equals(andy.getName())){
            System.out.println("HI ANDY");
        }
        else{
            System.out.println("No andy");
        }

//        System.out.println(temp);

    }
    
}