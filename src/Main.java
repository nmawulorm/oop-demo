/*
* Create three constructors where:
*   First constructor has no parameter
*   Second constructor has first and last name as parameters
*   Third constructor has first name, last name, account number and balance as parameters
*
* Create two instances of the bank account class in a method called test
* print the account details of each instance
*
*/


public class Main {
    public static void main(String[] args) {
        test();
    }

    private static void test(){
        BankAccount evans = new BankAccount("Evans", "Setsofia", "3051010103141", 54124781);
        evans.printAccountDetails();

        BankAccount james = new BankAccount("Evans", "Setsofia", "3051010103141", 54124781);
        james.printAccountDetails();
    }
}

class BankAccount {
    public String firstName = "Nicholas";       //Global variables / Properties  || Encapsulation = public
    public String lastName = "Mawulorm";       //Global variables / Properties  || Encapsulation = private
    public String accountNumber;
    public double balance;

    BankAccount() {

    }

    BankAccount(String firstName, String lastName) { // Constructor
        this.firstName = firstName;
        this.lastName = lastName;
    }

    BankAccount(String firstName, String lastName, String accountNumber, double balance) { // Constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void printAccountDetails(){
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

