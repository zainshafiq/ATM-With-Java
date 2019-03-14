package simpleBank;

//------- ATM.java -----------------

public class ATM {

  //Initialize data members
  private Integer cash;
  private Boolean inService;
  public CashDispenser dispense = new CashDispenser();
  public ReceiptPrinter printer = new ReceiptPrinter();
  public CardReader reader = new CardReader();
  public KeypadDisplay display = new KeypadDisplay();

  //Default constructor
  public ATM() {
    this.cash = 0;
    this.inService = false;
   }

  //Overloaded constructor
  public ATM(int cash, boolean inService) {
    this.cash = cash;
    this.inService = inService;
  }
  
//Returns the amount of cash inside the ATM
  public int queryCash() {
    return this.cash;
  }

  //Increase the amount of current cash by x
  public void increaseCash(int x) {
    this.cash = this.cash + x;
  }

  //Reduce the amount of current cash by x
  public void reduceCash(int x) {
    this.cash = this.cash - x;
  }

  //Returns the value of the inService variable
  public boolean getServiceStatus() {
    return this.inService;
  }

  //Toggles the inService variable from true to false and vice versa
  public void changeServiceStatus() {
    if (this.inService == true) {
      this.inService = false;
    }

    else {
      this.inService = true;
    }

    System.out.println("inService is now  " + this.inService);
  }
  
  //CashDispenser
  public class CashDispenser {
    public void dispenseCash(int x) {
      reduceCash(x);
      System.out.println(x + " dollars has been dispensed");
    }
  }

  //ReceiptPrinter
  public class ReceiptPrinter {
    public void printReceipt() {
      System.out.println("Receipt has been printed");
    }
  }

  //CardReader
  public class CardReader {
    public void readCard() {
      System.out.println("Card has been read");
    }
  }

  //KeypadDisplay
  public class KeypadDisplay {
    public void displayPINverification() {
      System.out.println("PIN has been verified");
    }
  }
}


  
