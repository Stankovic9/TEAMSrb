public class Person {

    private String position;
    private String name;
    private int balance;
   
    public Person(){
        position = "";
        name = "";
        balance = 0;
    }

    public Person(String myPos, String myName, int myBalance){
        position = myPos;
        name = myName;
        balance = myBalance;
    }

    public void setPosition(String myPos){
        position = myPos;
    }

    public void setName(String myName){
        name = myName;
    }

    public void setBalance(int myBalance){
        balance = myBalance;
    }

    public int getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }
}


