/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author shafiw
 */
public class Person {

    private String name;

    public Person() {
        this.name = "Default Name";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("The name is set to " + name);
    }
}
