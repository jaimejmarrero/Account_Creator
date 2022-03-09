//Jaime Marrero CS200

/*
This class creates an ArrayList that stores all accounts that are created utilizing the abstract account class.
 */

import java.util.ArrayList;

public class AccountManager {
    private ArrayList<Account> accounts;

    public AccountManager() {
        this.accounts = new ArrayList<Account>();
    }

    public AccountManager(ArrayList<Account> accounts){
        this.accounts = accounts;
    }

    public ArrayList<Account> getAccounts() { return accounts; }
    public Account getAccount(int i) {
        return accounts.get(i);
    }
    public Account getAccount(String name) {
        for(Account acc : accounts) {
            if(acc.getName().equals(name)) return acc;
        }
        return null;
    }
    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public String getInformation() {
        String result = "";
        // Using polymorphism to loop through all of the accounts without worrying about their class (only base class)
        for(Account acc : accounts) {
            result += acc.toString() + "\n";
        }
        return result;
    }
    public String getInformation(String accountName) {
        // Using polymorphism to loop through all of the accounts without worrying about their class (only base class)
        for(Account acc : accounts) {
            if(acc.getName().equals(accountName)) {
                return acc.toString();
            }
        }
        return null;
    }
}
