package ProgrammingElements.Assessment.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartParkingSlotManager {

    public static void main(String[] args) {

        ArrayList<String> parkedVehicles = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Smart Parking Slot Manager =====");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Parked Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String vehicleIn = sc.nextLine();

                    if (parkedVehicles.contains(vehicleIn)) {
                        System.out.println("Vehicle is already parked.");
                    } else {
                        parkedVehicles.add(vehicleIn);
                        System.out.println("Vehicle added successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Vehicle Registration Number: ");
                    String vehicleOut = sc.nextLine();

                    if (parkedVehicles.remove(vehicleOut)) {
                        System.out.println("Vehicle exited successfully.");
                    } else {
                        System.out.println("Vehicle not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Vehicle Registration Number to Search: ");
                    String searchVehicle = sc.nextLine();

                    if (parkedVehicles.contains(searchVehicle)) {
                        System.out.println("Vehicle is currently parked.");
                    } else {
                        System.out.println("Vehicle is not parked.");
                    }
                    break;

                case 4:
                    System.out.println("\nParked Vehicles:");

                    if (parkedVehicles.isEmpty()) {
                        System.out.println("No vehicles are currently parked.");
                    } else {
                        for (String vehicle : parkedVehicles) {
                            System.out.println(vehicle);
                        }
                    }

                    System.out.println("Total Occupied Parking Slots: " + parkedVehicles.size());
                    break;

                case 5:
                    System.out.println("Exiting Smart Parking Slot Manager...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}