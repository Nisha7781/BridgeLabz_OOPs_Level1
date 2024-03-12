import  java.util.*;
class BankAccount
{
    int balance;
    int accountNumber;


    public void deposit(int amount)
    {
        balance = balance +  amount;
        System.out.println("Balance after money deposit is: "+balance);
    }

    public void withdraw(int amount)
    {
        if (balance >= amount)
        {
            balance = balance - amount;
            System.out.println("Balance after money withdrawal is: "+balance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Account Number is: ");
        account.accountNumber = sc.nextInt();

        System.out.print("Account Balance is: ");
        account.balance = sc.nextInt();

        System.out.print("Enter money to deposit: ");
        int deposit_amount = sc.nextInt();
        account.deposit(deposit_amount);

        System.out.print("Enter money to withdraw: ");
        int withdraw_amount = sc.nextInt();
        account.withdraw(withdraw_amount);
    }
}

