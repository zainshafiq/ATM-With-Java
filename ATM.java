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

