package simpleBank;

//----- A01zainuddm.java (Main) -----------

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
  }
}
