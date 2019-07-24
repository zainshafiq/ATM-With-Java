/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nazmul
 */
public class Customer extends Person {

    public void withdrawCash(ATM atm, int amount) {
        System.out.println("current inService is " + atm.getServiceStatus());

        if (!atm.getServiceStatus()) {
            System.out.println("ATM is not in service");
        }
        if (atm.queryCash() < amount) {
            System.out.println("ATM has insufficient cash");
        } else {
            atm.reader.readCard();
            atm.display.displayPINverification();
            atm.dispense.dispenseCash(amount);
            atm.printer.printReceipt();
            System.out.println(amount + " successfully withdrawn from ATM");
        }

    }

}
