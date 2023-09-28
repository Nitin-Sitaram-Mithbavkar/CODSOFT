import java.util.HashMap;
import java.util.Scanner;
public class Task3{
    public static void main(String[] args) {
        ATMop obj = new ATMop();
    }
}
class Data{
     static int balance;
}

class ATMop {
    HashMap<Integer , Data >  map  = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    ATMop(){
        System.out.println("Welcome to our ATM");
        Data.balance = 0;
        menu();
    }

    public void menu(){
        System.out.println("******************************************************************************");
        System.out.println("Enter your choice");

        System.out.println("1 . check balance");
        System.out.println("2 . withdraw money");
        System.out.println("3 . deposit money");
        System.out.println("4 . exit");
        int x = sc.nextInt();

        if(x == 1){
            check_balance();
        }
        else if(x==2){
            withdraw();
        }
        else if(x==3){
            deposit();
        }
        else if(x == 4){
            System.out.println("thank you for using our ATM");
        }
        else{
            System.out.println("enter valid option");
            menu();
        }
    }

    public void check_balance(){
        System.out.println("your current balance " + Data.balance);
        System.out.println("******************************************************************************");
        menu();
    }

    public void deposit(){
        System.out.println("enter the amount ");
        float d = sc.nextFloat();
        Data.balance += d;
        System.out.println("amount deposited successfully ");
        System.out.println("******************************************************************************");
        menu();
    }

    public void withdraw(){
        System.out.println("enter the amount ");
        float d = sc.nextFloat();
        if(d > Data.balance) {System.out.println("ïnsufficient balance"); menu();}
        Data.balance -= d;
        System.out.println("amount withdraw successfully ");
        System.out.println("******************************************************************************");
        menu();
    }


}