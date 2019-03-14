package simpleBank;

//----- Operator.java ----------------------

public class Operator extends Person {

  public void topUpATM(ATM atm) {

    System.out.println("current inService is " + atm.getServiceStatus());
    System.out.println("current cash is " + atm.queryCash());

    //Checking ATM condition (in service/off)
    if (atm.getServiceStatus()) {
      atm.changeServiceStatus();
    }

    //Checking amount of cash ($5,000) in ATM
    if (atm.queryCash() < 5000) {
      atm.increaseCash(5000);
    }

    System.out.println("ATM now has : " + atm.queryCash() + " dollars");

    //Turn on the ATM
    atm.changeServiceStatus();
  }
}
