package simpleBank;

//----- A01zainuddm.java -----------

import java.util.Scanner;

public class A01zainuddm {

  public static void main(String[] args) {

    String inputName;
    int inputNumber;
    Scanner in = new Scanner(System.in);
    boolean isValid;

    //User input (an integer between 0 and 10000)
    do {
      isValid = true;
      System.out.println("Enter a number between 0 and 10000");
      inputNumber = Integer.parseInt(in.nextLine());

      if (inputNumber < 0 || inputNumber > 10000) {
        isValid = false;
        System.out.println("Invalid. Try again.");
      }

    } while (!isValid);
    
    //Create instance of an ATM with zero cash and not in service
    ATM atm1 = new ATM(0, false);

    //Create instance of an ATM with the amount that the user entered
    //and in service
    ATM atm2 = new ATM(inputNumber, true);

    //Create instance of an Operator
    Operator operator = new Operator();
    
    //User input (Operator's name)
    System.out.println("Enter a name for the operator");
    inputName = in.nextLine();
    operator.setName(inputName); //Setters

    //Call topUpATM() on the instances of the ATM
    System.out.println("Processing ATM 1");
    operator.topUpATM(atm1);
    System.out.println("Processing ATM 2");
    operator.topUpATM(atm2);
    
    //Create instance of a Customer
    Customer customer = new Customer();
    
    //User input (Customer's name)
    System.out.println("Enter a name for the customer");
    inputName = in.nextLine();
    customer.setName(inputName); //Setters
    int withdrawAmount;
    
    //User input (Withdrawal amount)
    System.out.println("Enter an amount to withdraw");
    withdrawAmount = Integer.parseInt(in.nextLine());
    
    //Call withdrawCash()
    customer.withdrawCash(atm2, withdrawAmount);
  }
}

  
