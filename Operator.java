/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author nazmul
 */
public class Operator extends Person {

    public void topUpATM(ATM atm) {

        System.out.println("current inService is " + atm.getServiceStatus());
        System.out.println("current cash is " + atm.queryCash());

        if (atm.getServiceStatus()) {
            atm.changeServiceStatus();
        }
        if (atm.queryCash() < 5000) {
            atm.increaseCash(5000);
        }
        System.out.println("ATM now has : " + atm.queryCash() + " dollars");
        atm.changeServiceStatus();

    }

}
