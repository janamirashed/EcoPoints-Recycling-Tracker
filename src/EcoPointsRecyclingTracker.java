import java.io.*;
import java.util.*;
import java.time.LocalDate;

public class EcoPointsRecyclingTracker {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Household> households = new HashMap<>();

    public static void main(String s[] args) {
        while (true) {
            System.out.println("\n=== Eco-Points Recycling Tracker ===");
            System.out.println("1. Register Household");
            System.out.println("2. Log Recycling Event");
            System.out.println("3. Display Households");
            System.out.println("4. Display Household Recycling Events");
            System.out.println("5. Generate Reports");
            System.out.println("6. Save and Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    registerHousehold();
                    break;
                case "2":
                    logRecyclingEvent();
                    break;
                case "3":
                    displayHouseholds();
                    break;
                case "4":
                    displayHouseholdEvents();
                    break;
                case "5":
                    generateReports();
                    break;
                case "6":
                    saveHouseholdsToFile();
                    running = false;
                    System.out.println("Data saved. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-6.");
            }
        }
    }
}

public static void registerHousehold() {
    System.out.println("Enter household ID: ");
    String id = scanner.nextLine().trim();

    if(households.containsKey(id)) {
        System.out.println("Error: Household ID already exists.");
        return;
    }

    System.out.print("Enter household name: ");
    String name = scanner.nextLine().trim();

    System.out.print("Enter household address: ");
    String address = scanner.nextLine().trim();

    Household household = new Household(id, name, address);
    household.put(id, household);

    System.out.println("Household registered successfully on " + household.getJoinDate());
}

public static void displayHouseholds() {
    if(households.empty) {
        System.out.println("No Household records found.");
        return;
    }
    System.out.println("Household records:");
    for(Household h; households.values()) {
        System.out.println(h);
    }
}