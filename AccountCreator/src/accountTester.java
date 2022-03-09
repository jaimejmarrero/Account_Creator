//Jaime Marrero CS200

/*
The Account Tester creates objects of the variety of different Account types that inherited from the Account super class.
It also prints out all the users stored in the Account ArrayList and compares them with the abstract .equals() method.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class accountTester {
    public static void main(String[] args){
        AccountManager accountManager = new AccountManager();

        accountManager.addAccount(new IndividualAccount("Jaime", "1/23/1988", "jaimejmarrero@gmail.com",
                new ArrayList<String>(), "Permanent", "MassBay" ));
        accountManager.addAccount(new IndividualAccount("Hilary", "10/26/1947", "hclinton@usa.gov", new ArrayList<String>(),
                "Permanent", "Yale Law"));

        accountManager.addAccount(new CommunityAccount("Name", "01/01/01", "test@example.com",
                new ArrayList<>(Arrays.asList("Connection 1", "Connection 2")),
                new ArrayList<>(Arrays.asList("Topic 1", "Topic 2")), "example.com", "Current Event"));
        accountManager.addAccount(new CommunityAccount("community account name", "08/11/19", "account@example.com",
                new ArrayList<>(Arrays.asList("example.com", "twitter.com")),
                new ArrayList<>(Arrays.asList("Java", "Programming")), "google.com", "Programming conference"));

        accountManager.addAccount(new BusinessAccount("Business", "09/09/20", "business@business.com",
                new ArrayList<String>(), "help@business.com", 79,
                new ArrayList<>(Arrays.asList("Intructor, 06/12/12, Instructing", "Software Engineer, 02/27/22, Software Engineering"))));
        accountManager.addAccount(new BusinessAccount("Twitter", "09/09/21", "business@twitter.com",
                new ArrayList<>(Arrays.asList("Facebook", "Youtube")), "help@twitter.com", 900,
                new ArrayList<>(Arrays.asList("Software Engineer, 02/27/22, Software Engineering"))));

        System.out.println("All account info: ");
        System.out.println(accountManager.getInformation());

        System.out.println("Twitter account: ");
        System.out.println(accountManager.getInformation("Twitter"));

        Account twitterAccount = accountManager.getAccount("Twitter");
        Account businessAccount = accountManager.getAccount("Business");

        System.out.print("Twitter account == Business Account?: ");
        System.out.println(twitterAccount.equals(businessAccount));

        System.out.print("Twitter account == Twitter Account?: ");
        System.out.println(twitterAccount.equals(twitterAccount));
    }
}
