package jobsheet_w04;

public class HospitalMain {
    public static void main(String[] args) {
        // 1. Hospital Initialization
        Hospital hospital = new Hospital("General Healthcare Hospital", "45 Health Avenue", "+1-555-0199");

        System.out.println("=== HOSPITAL INFORMATION ===");
        System.out.println("Hospital Name : " + hospital.getName());
        System.out.println("Address       : " + hospital.getAddress());
        System.out.println("Phone Number  : " + hospital.getPhoneNumber());
        System.out.println();

        // 2. Add Doctors
        System.out.println("=== ADD DOCTORS ===");
        Doctor doc1 = new Doctor("DOC-001", "Dr. John Smith", "Internal Medicine");
        Doctor doc2 = new Doctor("DOC-002", "Dr. Sarah Connor", "Pediatrics");
        Doctor doc3 = new Doctor("DOC-003", "Dr. Alan Grant", "Cardiology");

        hospital.addDoctor(doc1);
        hospital.addDoctor(doc2);
        hospital.addDoctor(doc3);
        System.out.println();

        // 3. Create Rooms
        System.out.println("=== ROOM CREATION ===");
        hospital.createRoom("Deluxe Suite", "VIP", 1);
        hospital.createRoom("Standard Ward A", "Class 1", 2);
        hospital.createRoom("General Ward B", "Class 2", 4);
        System.out.println();

        // 4. Display Doctor List
        System.out.println("=== DOCTOR LIST ===");
        for (Doctor doc : hospital.getListDoctor()) {
            System.out.println("Code: " + doc.getCode() + " | Name: " + doc.getName() + " | Specialization: " + doc.getSpecialization());
        }
        System.out.println();

        // 5. Display Room List & Total Bed Capacity
        System.out.println("=== ROOM LIST ===");
        for (Room room : hospital.getListRoom()) {
            System.out.println("Code: " + room.getCode() + " | Name: " + room.getName() + " | Type: " + room.getType() + " | Capacity: " + room.getCapacity());
        }
        System.out.println("Total Bed Capacity: " + hospital.getTotalBedCapacity() + " beds");
        System.out.println();

        // 6. Demonstrate Room Operations
        System.out.println("=== ROOM USAGE SIMULATION ===");
        Room targetRoom = hospital.findRoomByCode("R-002");
        if (targetRoom != null) {
            System.out.println("Selected Room: " + targetRoom.getName() + " (" + targetRoom.getCode() + ")");
            System.out.println("Capacity: " + targetRoom.getCapacity() + " | Occupied: " + targetRoom.getCurrentOccupancy());
            System.out.println("Available? " + (targetRoom.isAvailable() ? "Yes" : "Full"));

            System.out.println("\n-> Admitting 1 patient (occupyBed)...");
            targetRoom.occupyBed();
            System.out.println("Occupied: " + targetRoom.getCurrentOccupancy() + " / " + targetRoom.getCapacity());

            System.out.println("-> Admitting another patient (occupyBed)...");
            targetRoom.occupyBed();
            System.out.println("Occupied: " + targetRoom.getCurrentOccupancy() + " / " + targetRoom.getCapacity());
            System.out.println("Available? " + (targetRoom.isAvailable() ? "Yes" : "Full"));

            System.out.println("\n-> Discharging 1 patient (freeBed)...");
            targetRoom.freeBed();
            System.out.println("Occupied: " + targetRoom.getCurrentOccupancy() + " / " + targetRoom.getCapacity());
            System.out.println("Available? " + (targetRoom.isAvailable() ? "Yes" : "Full"));
        } else {
            System.out.println("Room not found!");
        }
    }
}
