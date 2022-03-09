//Jaime Marrero CS200

/*
An Individual Account for a user that extends from the abstract class Account while adding specific attributes for this
user.
 */

import java.util.ArrayList;

public class IndividualAccount extends Account {
    private ArrayList<String> accomplishments;
    private ArrayList<String> skills;
    private String notice;
    private String education;

    public IndividualAccount(String name, String date, String email,
                             ArrayList<String> connections,String notice,
                             String education){
        super(name, date, email, connections);
        this.notice = notice;
        this.education = education;
    }

    public IndividualAccount(){
        super();
        notice = "";
        education = "";
    }

    public ArrayList<String> getAccomplishments(){
        return accomplishments;
    }

    public void setAccomplishments(ArrayList<String> accomplishments){
        this.accomplishments = accomplishments;
    }

    public ArrayList<String> getSkills(){
        return skills;
    }

    public void setSkills(ArrayList<String> skills){
        this.skills = skills;
    }

    public String getNotice(){
        return notice;
    }
    public void setNotice(String notice){
        this.notice = notice;
    }

    public String getEducation(){
        return education;
    }
    public void setEducation (String education){
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString() + ", Accomplishments: " + accomplishments + ", Skills: " +
                skills + ", Notice: " + notice + ", Education: " + education;
    }

    //Uses the abstract equals method to compare values.
    public boolean equals(Object o) {
        // Object is compared to itself
        if(o == this) return true;
        // The object isn't an individual account
        if(!(o instanceof IndividualAccount)) return false;

        IndividualAccount acc = (IndividualAccount)o;
        if(!acc.getName().equals(this.getName())) return false;
        if(!acc.getDate().equals(this.getDate())) return false;
        if(!acc.getAddress().equals(this.getAddress())) return false;
        if(!acc.getConnections().equals(this.getConnections())) return false;
        if(!acc.getAccomplishments().equals(this.getAccomplishments())) return false;
        if(!acc.getSkills().equals(this.getSkills())) return false;
        if(!acc.getNotice().equals(this.getNotice())) return false;
        if(!acc.getEducation().equals(this.getEducation())) return false;

        return true;
    }
}
