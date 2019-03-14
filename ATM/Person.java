package simpleBank;

//------- Person.java -------------

public class Person {

  private String name;

  //Default constructors
  public Person() {
    this.name = "Default Name";
  }

  //Returns name
  public String getName() {
    return this.name;
  }

  //Set Name
  public void setName(String name) {
    this.name = name;
    System.out.println("The name is set to " + name);
  }
}
