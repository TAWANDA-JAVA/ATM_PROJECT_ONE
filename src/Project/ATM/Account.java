package Project.ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int accountNumber;
    private int pinNumber;
    private  double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int getAccountNumber() {
        return accountNumber;
    }

    public int setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        return accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking Amount Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Enter Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance- amount) >= 0) {
           calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance Cannot Negative" );
            System.out.println("YOU CANNOT NOT OVERDRAW " + "\n");
        }

    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving Amount Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Enter Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance- amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Savings Account Balance: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Balance Cannot be Negative");
            System.out.println("YOU CANNOT NOT OVERDRAW " + "\n");
        }

    }

    public void getCheckingDepositInput(){
        System.out.println("Checking Amount Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Enter Amount you want to Deposit in the Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance Cannot be Negative");
            System.out.println("YOU CANNOT NOT OVERDRAW " + "\n");
        }

    }

    public void getSavingDepositInput(){
        System.out.println("Saving Amount Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Enter Amount you want to Deposit in the Saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance + amount) >= 0) {
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Balance Cannot be Negative");
            System.out.println("YOU CANNOT NOT OVERDRAW " + "\n");
        }

    }



}
