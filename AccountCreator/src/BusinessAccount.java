//Jaime Marrero CS200

/*
A Business Account for a user that extends from the abstract class Account while adding specific attributes for this
user.
 */

import java.util.ArrayList;

public class BusinessAccount extends Account{
    private String secondEmail;
    private ArrayList<String> jobs;
    private int maxAdvertisement;

    public BusinessAccount(String name, String date, String email, ArrayList<String> connections, String secondEmail,
                           int maxAdvertisement, ArrayList<String> jobs) {
        super(name, date, email, connections);
        this.secondEmail = secondEmail;
        this.maxAdvertisement = maxAdvertisement;
        this.jobs = jobs;
    }

    public BusinessAccount(){
        super();
        secondEmail = "";
        maxAdvertisement = 0;
        jobs = new ArrayList<String>();
    }

    public ArrayList<String> getJobs() {
        return jobs;
    }
    public void setJobs(ArrayList<String>jobs){
        // "Tutor, 06/12/12, Tutoring"
        this.jobs = jobs;
    }

    public String getSecondEmail() {
        return secondEmail;
    }
    public void setSecondEmail(String secondEmail) {
        this.secondEmail =  secondEmail;
    }

    public int getMaxAdvertisement() {
        return maxAdvertisement;
    }

    public void setMaxAdvertisement (int maxAdvertisement) {
        this.maxAdvertisement = maxAdvertisement;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jobs: " + jobs + ", Second Email: " + secondEmail + ", Days of Advertising: " +
                maxAdvertisement;
    }

    //Uses the abstract equals method to compare values.
    public boolean equals(Object o) {
        // Object is compared to itself
        if(o == this) return true;
        // The object isn't an individual account
        if(!(o instanceof BusinessAccount)) return false;

        BusinessAccount acc = (BusinessAccount)o;
        if(!acc.getName().equals(this.getName())) return false;
        if(!acc.getDate().equals(this.getDate())) return false;
        if(!acc.getAddress().equals(this.getAddress())) return false;
        if(!acc.getConnections().equals(this.getConnections())) return false;
        if(!acc.getJobs().equals(this.getJobs())) return false;
        if(!acc.getSecondEmail().equals(this.getSecondEmail())) return false;
        if(acc.getMaxAdvertisement() != this.getMaxAdvertisement()) return false;

        return true;
    }
}
