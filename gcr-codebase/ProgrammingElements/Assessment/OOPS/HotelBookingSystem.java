package ProgrammingElements.Assessment.OOPS;

class HotelBookingSystem {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBookingSystem() {
        guestName = "Unknown Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBookingSystem(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBookingSystem(HotelBookingSystem booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBookingSystem booking1 = new HotelBookingSystem();
        HotelBookingSystem booking2 = new HotelBookingSystem("Amit", "Deluxe", 3);
        HotelBookingSystem booking3 = new HotelBookingSystem(booking2);

        booking1.displayBookingDetails();
        System.out.println();

        booking2.displayBookingDetails();
        System.out.println();

        booking3.displayBookingDetails();
    }
}