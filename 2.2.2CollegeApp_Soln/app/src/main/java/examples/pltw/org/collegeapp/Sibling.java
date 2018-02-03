package examples.pltw.org.collegeapp;

/**
 * Created by operam on 2/1/2018.
 */

public class Sibling extends FamilyMember {

    int age;

    public Sibling(String firstName, String lastName, int age){
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.age = age;
    }

    public Sibling(String firstName, String lastName){
        super.setFirstName(firstName);
        super.setLastName(lastName);
        age = 0;
    }
    public Sibling(){
        super();
        age = 0;
    }

    public String toString(){
        return "Sibling " + getFirstName() + " " + getLastName() + "\n" + "age: " + age;
    }
}
