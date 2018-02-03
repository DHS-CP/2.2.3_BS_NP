package examples.pltw.org.collegeapp;

/**
 * Created by ckinnard on 4/3/2017.
 */
public class Guardian extends FamilyMember {
    private String occupation;

    public Guardian(String firstName, String lastName, String occupation){
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.occupation = occupation;
    }

    public Guardian(String firstName, String lastName){
        super.setFirstName(firstName);
        super.setLastName(lastName);
        occupation = "unknown";
    }
    public Guardian(){
        super();
        occupation = "unknown";
    }

    public String toString(){
        return "Guardian " + getFirstName() + " " + getLastName() + "\n" + "Occupation " + getOccupation();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }


}
