import java.util.Scanner;
class Naveen1_322{
    float Balance;
    int PIN=5999;

    public void checkPIN(){
        System.out.println("Enter your Pin: ");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if(pin == PIN){
            check();
        }
        else{
            System.out.println("Enter a valid PIN");
            check();
        }
    }

    public void check(){
        System.out.println("Enter your choice: ");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option == 1){
            checkbalance();
        }
        else if(option == 2){
            depositmoney();
        }
        else if(option == 3){
            withdrawmoney();
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }
    public void checkbalance(){
        System.out.println("Balance: " + Balance);
        check();
    }
    public void depositmoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposited Successfully");
        check();
    }
    public void withdrawmoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withdrawal successful");
        }
        check();
    }

}

public class Atm {
    public static void main(String[] args){
        Naveen1_322 obj = new Naveen1_322();
        obj.checkPIN();

    }
}
