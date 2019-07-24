/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author nazmul
 */
public class A01shafiq123 {

    public static void main(String[] args) {

        String inputName;
        int inputNumber;
        Scanner in = new Scanner(System.in);
        boolean isValid;
// Answer to part A
        do {
            isValid = true;
            System.out.println("Enter a number between 0 and 10000");
            inputNumber = Integer.parseInt(in.nextLine());
            if (inputNumber < 0 || inputNumber > 10000) {
                isValid = false;
                System.out.println("Invalid. Try again.");
            }
        } while (!isValid);

        // Answer to part B
        ATM atm1 = new ATM(0, false);
        ATM atm2 = new ATM(inputNumber, true);

        // Answer for part C of main program
        Operator operator = new Operator();
        System.out.println("Enter a name for the operator");
        inputName = in.nextLine();
        operator.setName(inputName);
        System.out.println("Processing ATM 1");
        operator.topUpATM(atm1);
        System.out.println("Processing ATM 2");
        operator.topUpATM(atm2);

        // Answer for par D of main program
        Customer customer = new Customer();
        System.out.println("Enter a name for the customer");
        inputName = in.nextLine();
        customer.setName(inputName);
        int withdrawAmount;
        System.out.println("Enter an amount to withdraw");
        withdrawAmount = Integer.parseInt(in.nextLine());
        customer.withdrawCash(atm2, withdrawAmount);
    }

}
