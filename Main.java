package com.mycompany.mavenproject2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hostel[] group1Hostels = new Hostel[5];

        // Group 1 Records (H01 - H05)
        group1Hostels[0] = new Hostel("H01", "Ndejje Gardens", "Self-contained (Single)", 1500000.00, "Partially Occupied", 0.60131826, 32.47871000);
        group1Hostels[1] = new Hostel("H02", "Campton", "Self-contained (Single)", 800000.00, "Occupied", 0.60036445, 32.47784000);
        group1Hostels[2] = new Hostel("H03", "Elper 1", "Self-contained (Single)", 900000.00, "Occupied", 0.60048749, 32.47732700);
        group1Hostels[3] = new Hostel("H04", "City Hostels", "Self-contained (Single)", 1200000.00, "Occupied", 0.60393959, 32.47631000);
        group1Hostels[4] = new Hostel("H05", "Elpa Hostels Annex", "Self-contained (Single)", 1000000.00, "Partially Occupied", 0.60358787, 32.47743400);

        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            
            while (running) {
                System.out.println("\n==================================================");
                System.out.println("   GROUP 1 HOSTEL MANAGEMENT SYSTEM (H01-H05)  ");
                System.out.println("==================================================");
                System.out.println("1. View All Hostel Records");
                System.out.println("2. Search Hostel by ID");
                System.out.println("3. Calculate Average Rental Price for Hostels");
                System.out.println("4. Count and display number of fully and not fully occupied hostels");
                System.out.println("5. Exit");
                System.out.print("Select an option (1-5): ");
                
                int choice = scanner.nextInt();
                scanner.nextLine();
                
                switch (choice) {
                                       case 1:
                        System.out.println("\n--- ALL HOSTEL RECORDS ---");
                        for (Hostel h : group1Hostels) {
                            h.printDetails();
                        }
                        break;

                    case 2:
                        System.out.print("Enter Hostel ID to search (e.g., H01): ");
                        String searchId = scanner.nextLine();
                        boolean found = false;
                        for (Hostel h : group1Hostels) {
                            if (h.getHostelId().equalsIgnoreCase(searchId)) {
                                System.out.println("\n--- RECORD FOUND ---");
                                h.printDetails();
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Hostel with ID " + searchId + " not found.");
                        }
                        break;

                    case 3:
                        double totalSum = 0.0;
                        for (Hostel h : group1Hostels) {
                            totalSum += h.getRentalPrice();
                        }
                        double averagePrice = totalSum / group1Hostels.length;
                        System.out.printf("\nAverage Rental Price: UGX %,10.2f%n", averagePrice);
                        break;

                    case 4:
                        int fullyOccupiedCount = 0;
                        int notFullyOccupiedCount = 0;

                        for (Hostel h : group1Hostels) {
                            if (h.getOccupancyStatus().equalsIgnoreCase("Occupied") || 
                                h.getOccupancyStatus().equalsIgnoreCase("Fully Occupied")) {
                                fullyOccupiedCount++;
                            } else {
                                notFullyOccupiedCount++;
                            }
                        }

                        System.out.println("\n--- OCCUPANCY SUMMARY ---");
                        System.out.println("Fully Occupied Hostels: " + fullyOccupiedCount);
                        System.out.println("Not Fully Occupied (Vacant/Partial) Hostels: " + notFullyOccupiedCount);
                        break;

                    case 5:
                        System.out.println("Exiting program. Goodbye!");
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid option. Please select a number between 1 and 5.");
                }
            }
        }
    }
}

OUTPUT
  cd C:\Users\Personal\Documents\NetBeansProjects\mavenproject2; "JAVA_HOME=C:\\Program Files\\Apache NetBeans\\jdk" cmd /c "\"C:\\Program Files\\Apache NetBeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.vmArgs= \"-Dexec.args=${exec.vmArgs} -classpath %classpath ${exec.mainClass} ${exec.appArgs}\" -Dexec.appArgs= -Dexec.mainClass=com.mycompany.mavenproject2.Mavenproject2 \"-Dexec.executable=C:\\Program Files\\Apache NetBeans\\jdk\\bin\\java.exe\" \"-Dmaven.ext.class.path=C:\\Program Files\\Apache NetBeans\\java\\maven-nblib\\netbeans-eventspy.jar\" --no-transfer-progress process-classes org.codehaus.mojo:exec-maven-plugin:3.5.1:exec"
Scanning for projects...

--------------------< com.mycompany:mavenproject2 >---------------------
Building mavenproject2 1.0-SNAPSHOT
  from pom.xml
--------------------------------[ jar ]---------------------------------

--- resources:3.4.0:resources (default-resources) @ mavenproject2 ---
skip non existing resourceDirectory C:\Users\Personal\Documents\NetBeansProjects\mavenproject2\src\main\resources

--- compiler:3.15.0:compile (default-compile) @ mavenproject2 ---
Recompiling the module because of changed source code.
Compiling 2 source files with javac [debug release 25] to target\classes

--- exec:3.5.1:exec (default-cli) @ mavenproject2 ---

==================================================
   GROUP 1 HOSTEL MANAGEMENT SYSTEM (H01-H05)  
==================================================
1. View All Hostel Records
2. Search Hostel by ID
3. Calculate Average Rental Price for Hostels
4. Count and display number of fully and not fully occupied hostels
5. Exit
Select an option (1-5): 1

--- ALL HOSTEL RECORDS ---
ID: H01  | Name: Ndejje Gardens     | Type: Self-contained (Single) | Price: UGX 1,500,000.00 | Status: Partially Occupied | Lat: 0.601318  | Long: 32.478710
ID: H02  | Name: Campton            | Type: Self-contained (Single) | Price: UGX 800,000.00 | Status: Occupied           | Lat: 0.600364  | Long: 32.477840
ID: H03  | Name: Elper 1            | Type: Self-contained (Single) | Price: UGX 900,000.00 | Status: Occupied           | Lat: 0.600487  | Long: 32.477327
ID: H04  | Name: City Hostels       | Type: Self-contained (Single) | Price: UGX 1,200,000.00 | Status: Occupied           | Lat: 0.603940  | Long: 32.476310
ID: H05  | Name: Elpa Hostels Annex | Type: Self-contained (Single) | Price: UGX 1,000,000.00 | Status: Partially Occupied | Lat: 0.603588  | Long: 32.477434

==================================================
   GROUP 1 HOSTEL MANAGEMENT SYSTEM (H01-H05)  
==================================================
1. View All Hostel Records
2. Search Hostel by ID
3. Calculate Average Rental Price for Hostels
4. Count and display number of fully and not fully occupied hostels
5. Exit
Select an option (1-5): 2
Enter Hostel ID to search (e.g., H01): H01

--- RECORD FOUND ---
ID: H01  | Name: Ndejje Gardens     | Type: Self-contained (Single) | Price: UGX 1,500,000.00 | Status: Partially Occupied | Lat: 0.601318  | Long: 32.478710

==================================================
   GROUP 1 HOSTEL MANAGEMENT SYSTEM (H01-H05)  
==================================================
1. View All Hostel Records
2. Search Hostel by ID
3. Calculate Average Rental Price for Hostels
4. Count and display number of fully and not fully occupied hostels
5. Exit
Select an option (1-5): 3

Average Rental Price: UGX 1,080,000.00

==================================================
   GROUP 1 HOSTEL MANAGEMENT SYSTEM (H01-H05)  
==================================================
1. View All Hostel Records
2. Search Hostel by ID
3. Calculate Average Rental Price for Hostels
4. Count and display number of fully and not fully occupied hostels
5. Exit
Select an option (1-5): 4

--- OCCUPANCY SUMMARY ---
Fully Occupied Hostels: 3
Not Fully Occupied (Vacant/Partial) Hostels: 2

==================================================
   GROUP 1 HOSTEL MANAGEMENT SYSTEM (H01-H05)  
==================================================
1. View All Hostel Records
2. Search Hostel by ID
3. Calculate Average Rental Price for Hostels
4. Count and display number of fully and not fully occupied hostels
5. Exit
Select an option (1-5): 4

--- OCCUPANCY SUMMARY ---
Fully Occupied Hostels: 3
Not Fully Occupied (Vacant/Partial) Hostels: 2

==================================================
   GROUP 1 HOSTEL MANAGEMENT SYSTEM (H01-H05)  
==================================================
1. View All Hostel Records
2. Search Hostel by ID
3. Calculate Average Rental Price for Hostels
4. Count and display number of fully and not fully occupied hostels
5. Exit
Select an option (1-5): 5
Exiting program. Goodbye!
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  01:32 min
Finished at: 2026-09-28T09:35:25+03:00
------------------------------------------------------------------------
