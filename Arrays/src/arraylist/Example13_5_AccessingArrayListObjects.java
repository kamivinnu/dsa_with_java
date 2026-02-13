package arraylist;

/*
 * Example 13.5: Accessing elements in ArrayList
 * -------------------------------------------------
 * • isEmpty()
 * • size()
 * • get()
 * • set()
 */

import java.util.ArrayList;

public class Example13_5_AccessingArrayListObjects {

    public static void main(String[] args) {

        ArrayList<String> topCompanies = new ArrayList<>();

        System.out.println("Is the list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        System.out.println("Here are the top " + topCompanies.size() + " Companies");
        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        System.out.println("Best Company: " + bestCompany);

        topCompanies.set(4, "Walmart");

        System.out.println("Modified list: " + topCompanies);
    }
}
