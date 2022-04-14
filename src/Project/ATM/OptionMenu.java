package Project.ATM;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends  Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Map<Integer,Integer> data = new HashMap<>();

    public void getLogin() throws IOException{
        int x = 1;
        do{
            try{
                data.put(100200300,2020);
                data.put(100200400,2030);

                System.out.println("Welcome To The Bank ATM");
                System.out.println("Enter your Account Number: ");
                setAccountNumber(menuInput.nextInt());

                System.out.println("Enter your PIN number");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e){
                System.out.println("\n" + "Invalid Characters . Only Numbers." + "\n");
                x = 2;
            }

            int an = getAccountNumber();
            int pn = getPinNumber();
            if(data.containsKey(an) && data.get(an) == pn){
                getAccountType();
            }else{
                System.out.println("\n" + "Wrong Account number or pin number" + "\n");
            }
        } while (x ==1);

    }
    public void getAccountType(){
        System.out.println("Select the Account you want to access: ");
        System.out.println(" Type 1 - Checking Account");
        System.out.println(" Type 2 - Saving Account");
        System.out.println(" Type 3 - Exit");

        int selection = menuInput.nextInt();

        switch (selection){
            case 1: getChecking();
                    break;
            case 2: getSaving();
                    break;
            case 3: System.out.println("Thank you for using ATM, bye.  \n");
                   break;
            default: System.out.println("\n" + "Invalid Choice." + "\n");
                     getAccountType();
        }

    }
    public  void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println(" Type 1 - View Balance");
        System.out.println(" Type 2 - Withdraw Funds");
        System.out.println(" Type 3 - Deposit Funds");
        System.out.println(" Type 4 - Exit");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();

        switch (selection){
            case 1: System.out.println("Checking Account Balance :" + moneyFormat.format(getCheckingBalance()));
                    getAccountType();
                    break;
            case 2: getCheckingWithdrawInput();
                    getAccountType();
                    break;
            case 3: getCheckingDepositInput();
                    getAccountType();
                    break;
            case 4: System.out.println("\"Thank you for using ATM, bye. ");
                    break;
            default: System.out.println("\n" + "Invalid Choice, " + "\n");
                     getChecking();

        }

    }

    public  void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println(" Type 1 - View Balance");
        System.out.println(" Type 2 - Withdraw Funds");
        System.out.println(" Type 3 - Deposit Funds");
        System.out.println(" Type 4 - Exit");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();

        switch (selection){
            case 1: System.out.println("Saving Account Balance :" + moneyFormat.format(getSavingBalance()));
                    getAccountType();
                    break;
            case 2: getSavingWithdrawInput();
                    getAccountType();
                    break;
            case 3: getSavingDepositInput();
                    getAccountType();
                    break;
            case 4: System.out.println("\"Thank you for banking with Barclays Bank, bye. ");
                   break;
            default: System.out.println("\n" + "Invalid Choice, " + "\n");
                    getChecking();

        }

    }



}
