import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StateCapitalsMap {

    public static void main(String[] args) {
        // Defines the HashMap with states and capitals
        Map<String, String> statesAndCapitals = new HashMap<>();
        statesAndCapitals.put("Alabama", "Montgomery");
        statesAndCapitals.put("Alaska", "Juneau");
        statesAndCapitals.put("Arizona", "Phoenix");
        statesAndCapitals.put("Arkansas", "Little Rock");
        statesAndCapitals.put("California", "Sacramento");
        statesAndCapitals.put("Colorado", "Denver");
        statesAndCapitals.put("Connecticut", "Hartford");
        statesAndCapitals.put("Delaware", "Dover");
        statesAndCapitals.put("Florida", "Tallahassee");
        statesAndCapitals.put("Georgia", "Atlanta");
        statesAndCapitals.put("Hawaii", "Honolulu");
        statesAndCapitals.put("Idaho", "Boise");
        statesAndCapitals.put("Illinois", "Springfield");
        statesAndCapitals.put("Indiana", "Indianapolis");
        statesAndCapitals.put("Iowa", "Des Moines");
        statesAndCapitals.put("Kansas", "Topeka");
        statesAndCapitals.put("Kentucky", "Frankfort");
        statesAndCapitals.put("Louisiana", "Baton Rouge");
        statesAndCapitals.put("Maine", "Augusta");
        statesAndCapitals.put("Maryland", "Annapolis");
        statesAndCapitals.put("Massachusetts", "Boston");
        statesAndCapitals.put("Michigan", "Lansing");
        statesAndCapitals.put("Minnesota", "Saint Paul");
        statesAndCapitals.put("Mississippi", "Jackson");
        statesAndCapitals.put("Missouri", "Jefferson City");
        statesAndCapitals.put("Montana", "Helena");
        statesAndCapitals.put("Nebraska", "Lincoln");
        statesAndCapitals.put("Nevada", "Carson City");
        statesAndCapitals.put("New Hampshire", "Concord");
        statesAndCapitals.put("New Jersey", "Trenton");
        statesAndCapitals.put("New Mexico", "Santa Fe");
        statesAndCapitals.put("New York", "Albany");
        statesAndCapitals.put("North Carolina", "Raleigh");
        statesAndCapitals.put("North Dakota", "Bismarck");
        statesAndCapitals.put("Ohio", "Columbus");
        statesAndCapitals.put("Oklahoma", "Oklahoma City");
        statesAndCapitals.put("Oregon", "Salem");
        statesAndCapitals.put("Pennsylvania", "Harrisburg");
        statesAndCapitals.put("Rhode Island", "Providence");
        statesAndCapitals.put("South Carolina", "Columbia");
        statesAndCapitals.put("South Dakota", "Pierre");
        statesAndCapitals.put("Tennessee", "Nashville");
        statesAndCapitals.put("Texas", "Austin");
        statesAndCapitals.put("Utah", "Salt Lake City");
        statesAndCapitals.put("Vermont", "Montpelier");
        statesAndCapitals.put("Virginia", "Richmond");
        statesAndCapitals.put("Washington", "Olympia");
        statesAndCapitals.put("West Virginia", "Charleston");
        statesAndCapitals.put("Wisconsin", "Madison");
        statesAndCapitals.put("Wyoming", "Cheyenne");

        // Displays the contents of the HashMap
        System.out.println("States and Capitals:");
        for (Map.Entry<String, String> entry : statesAndCapitals.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Uses TreeMap to sort by state names
        Map<String, String> sortedStatesAndCapitals = new TreeMap<>(statesAndCapitals);

        // Displays the contents of the TreeMap
        System.out.println("\nStates and Capitals (Sorted Alphabetically):");
        for (Map.Entry<String, String> entry : sortedStatesAndCapitals.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Prompts the user to enter a state and displays its capital
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a state to find its capital: ");
        String state = scanner.nextLine().trim();

        // Displays the capital of the entered state
        String capital = sortedStatesAndCapitals.get(state);
        if (capital != null) {
            System.out.println("The capital of " + state + " is " + capital + ".");
        } else {
            System.out.println("Error.");
        }

        scanner.close();
    }
}