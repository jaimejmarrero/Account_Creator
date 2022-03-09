//Jaime Marrero CS200

/*
The abstract Account class that the other accounts use to inherit their key attributes that are shared amongst them.
Composed of mutator methods, the toString object and abstract method .equals() call.
 */

import java.util.ArrayList;

public abstract class Account {
    private String name;
    private String date;
    private String email;
    private ArrayList<String> connections;

    public Account(String name, String date, String email, ArrayList<String> connections) {
        this.name = name;
        this.date = date;
        this.email = email;
        this.connections = connections;
    }

    public Account() {
        this.name = "";
        this.date = "";
        this.email = "";
        this.connections = new ArrayList<String>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }

    public String getAddress(){
        return email;
    }

    public void setAddress(String address){
        this.email = email;
    }

    public ArrayList<String> getConnections(){
        return connections;
    }
    public void addConnections(ArrayList<String>connections){
        this.connections = connections;
    }

    @Override
    public String toString() {
        return "Account Name: " + name + ", Date Created: " + date + ", Email: " + email + ", Connections: "
                + connections + "";
    }

    //Included abstract class
    public abstract boolean equals(Object o);
}
