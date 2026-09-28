package com.mycompany.mavenproject2;

//  Fields
public class Hostel {
    private String hostelId;
    private String name;
    private String accommodationType;
    private double rentalPrice;
    private String occupancyStatus;
    private double latitude;
    private double longitude;

    // Constructor
    public Hostel(String hostelId, String name, String accommodationType, double rentalPrice, String occupancyStatus, double latitude, double longitude) {
        this.hostelId = hostelId;
        this.name = name;
        this.accommodationType = accommodationType;
        this.rentalPrice = rentalPrice;
        this.occupancyStatus = occupancyStatus;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters
    public String getHostelId() { return hostelId; }
    public String getName() { return name; }
    public String getAccommodationType() { return accommodationType; }
    public double getRentalPrice() { return rentalPrice; }
    public String getOccupancyStatus() { return occupancyStatus; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }

    // Print details 
    public void printDetails() {
        System.out.printf("ID: %-4s | Name: %-18s | Type: %-22s | Price: UGX %,10.2f | Status: %-18s | Lat: %-9.6f | Long: %-9.6f%n",
                hostelId, name, accommodationType, rentalPrice, occupancyStatus, latitude, longitude);
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
