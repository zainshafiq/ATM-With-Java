/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author nazmul
 */
public class ATM {

    private Integer cash;
    private Boolean inService;
    public CashDispenser dispense = new CashDispenser();
    public ReceiptPrinter printer = new ReceiptPrinter();
    public CardReader reader = new CardReader();
    public KeypadDisplay display = new KeypadDisplay();

// Default constructor
    public ATM() {
        this.cash = 0;
        this.inService = true;
    }
// Overloaded constructor

    public ATM(int cash, boolean inService) {
        this.cash = cash;
        this.inService = inService;
    }

    public int queryCash() {
        return this.cash;
    }

    public void increaseCash(int x) {
        this.cash = this.cash + x;
    }

    public void reduceCash(int x) {
        this.cash = this.cash - x;
    }

    public boolean getServiceStatus() {
        return this.inService;
    }

    public void changeServiceStatus() {
        if (this.inService == true) {
            this.inService = false;
        } else {
            this.inService = true;
        }

        System.out.println("inService is now  " + this.inService);
    }

    public class CashDispenser {

        public void dispenseCash(int x) {
            reduceCash(x);
            System.out.println(x + " dollars has been dispensed");
        }
    }

    public class ReceiptPrinter {

        public void printReceipt() {
            System.out.println("Receipt has been printed");
        }
    }

    public class CardReader {

        public void readCard() {
            System.out.println("Card has been read");
        }
    }

    public class KeypadDisplay {

        public void displayPINverification() {

            System.out.println("PIN has been verified");
        }
    }
}
