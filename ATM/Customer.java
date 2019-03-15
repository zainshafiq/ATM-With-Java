package simpleBank;

//------- Customer.java ----------------

public class Customer extends Person {

  public void withdrawCash(ATM atm, int amount) {

    //Print the service status of the ATM
    System.out.println("current inService is " + atm.getServiceStatus());

    if (!atm.getServiceStatus()) {
      System.out.println("ATM is not in service");
    }

    if (atm.queryCash() < amount) {
      System.out.println("ATM has insufficient cash");
    }

    else {
      //Call readCard() method
      atm.reader.readCard();

      //Call displayPINverification() method
      atm.display.displayPINverification();

      //Call dispenseCash()
      atm.dispense.dispenseCash(amount);

      //Call printReceipt()
      atm.printer.printReceipt();

      //Print
      System.out.println(amount + " successfully withdrawn from ATM");
    }

  }
}
