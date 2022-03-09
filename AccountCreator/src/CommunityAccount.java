//Jaime Marrero CS200

/*
A Community Account for a user that extends from the abstract class Account while adding specific attributes for this
user.
 */

import java.util.ArrayList;

public class CommunityAccount extends Account {
    private ArrayList<String> topicsOfInterest;
    private String websiteLink;
    private String currentEvent;


    public CommunityAccount(String name, String date, String email, ArrayList<String> connections, ArrayList<String> topics, String link, String event) {
        super(name, date, email, connections);
        this.topicsOfInterest = topics;
        this.websiteLink = link;
        this.currentEvent = event;
    }

    public CommunityAccount() {
        super();
        this.topicsOfInterest = new ArrayList<String>();
        this.websiteLink = "";
        this.currentEvent = "";
    }

    public ArrayList<String> getTopicsOfInterest() { return topicsOfInterest; }
    public void setTopicsOfInterest(ArrayList<String> topics) {
        this.topicsOfInterest = topics;
    }

    public String getWebsiteLink() { return websiteLink; }
    public void setWebsiteLink(String link) {
        this.websiteLink = link;
    }

    public String getCurrentEvent() { return currentEvent; }
    public void setCurrentEvent(String event) {
        this.currentEvent = event;
    }

    @Override
    public String toString() {
        return super.toString() + ", Topics of Interest: " + topicsOfInterest + ", Website Link: " + websiteLink + ", Current Event: " + currentEvent;
    }

    //Uses the abstract equals method to compare values.
    public boolean equals(Object o) {
        // Object is compared to itself
        if(o == this) return true;
        // The object isn't an individual account
        if(!(o instanceof CommunityAccount)) return false;

        CommunityAccount acc = (CommunityAccount)o;
        if(!acc.getName().equals(this.getName())) return false;
        if(!acc.getDate().equals(this.getDate())) return false;
        if(!acc.getAddress().equals(this.getAddress())) return false;
        if(!acc.getConnections().equals(this.getConnections())) return false;
        if(!acc.getTopicsOfInterest().equals(this.getTopicsOfInterest())) return false;
        if(!acc.getWebsiteLink().equals(this.getWebsiteLink())) return false;
        if(!acc.getCurrentEvent().equals(this.getCurrentEvent())) return false;

        return true;
    }
}
