package examples.pltw.org.collegeapp;

import java.util.ArrayList;

/**
 * Created by operam on 1/24/2018.
 */

public class Family {
    private static final String TAG = "Family";
    private ArrayList<FamilyMember> family;
    private static Family sFamily;


    private Family(){
        family = new ArrayList();
        Guardian me = new Guardian("Nikolai", "Peram");
        Guardian you = new Guardian();
        family.add(me);
        family.add(you);
        family.add(new Guardian("Dank", "Memes"));
    }

    public static Family get(){
        if (sFamily == null){
            sFamily = new Family();
        }
        return sFamily;
    }
    public void setFamily(ArrayList<FamilyMember> family){
        this.family = family;
    }
    public ArrayList<FamilyMember> getFamily(){
        return family;
    }
}
