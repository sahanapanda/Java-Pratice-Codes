import java.util.Scanner;

// Parent class
class Person {
    private String name;

    // Default constructor
    Person() {
        name = "Unknown";
    }

    // Parameterized constructor
    Person(String name) {
        this.name = name;
    }

    // Getter for encapsulation
    String getName() {
        return name;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
    }
}

// Child class - Inheritance
class Passenger extends Person {
    private int seatNumber;

    // Constructor using super
    Passenger(String name, int seatNumber) {
        super(name);
        this.seatNumber = seatNumber;
    }
}

class Bus {

    // Encapsulation
    private boolean[] seats;
    private Passenger[] passengers;
    private double[] fares;

    // final constant
    static final int DEFAULT_SEATS = 20;

    // static variable
    static int totalBuses = 0;

    // Default constructor
    Bus() {
        this(DEFAULT_SEATS);
    }

    // Parameterized constructor
    Bus(int totalSeats) {
        seats = new boolean[totalSeats];
        passengers = new Passenger[totalSeats];
        fares = new double[totalSeats];

        totalBuses++;
    }

    void displayAvailableSeats() {
        System.out.println("\nAvailable Seats:");
        boolean found = false;

        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                System.out.print((i + 1) + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No seats are currently available.");
        }

        System.out.println();
    }

    // Method overloading
    int bookSeat(int seat, String name) {
        return bookSeat(seat, name, 50);
    }

    // Overloaded method with fare
    int bookSeat(int seat, String name, double fare) {
        if (seat < 1 || seat > seats.length) {
            System.out.println("Invalid seat number.");
            return 0;
        }

        if (seats[seat - 1]) {
            System.out.println("Seat is already booked.");
            return 0;
        }

        seats[seat - 1] = true;
        passengers[seat - 1] = new Passenger(name, seat);
        fares[seat - 1] = fare;

        System.out.println("Seat " + seat + " booked successfully.");
        return 1;
    }

    void cancelBooking(int seat) {
        if (seat < 1 || seat > seats.length) {
            System.out.println("Invalid seat number.");
        } else if (!seats[seat - 1]) {
            System.out.println("Seat is not booked.");
        } else {
            seats[seat - 1] = false;
            passengers[seat - 1] = null;
            fares[seat - 1] = 0;

            System.out.println("Booking for seat " + seat + " cancelled.");
        }
    }

    void checkSeat(int seat) {
        if (seat < 1 || seat > seats.length) {
            System.out.println("Invalid seat number.");
        } else if (seats[seat - 1]) {
            System.out.println("Seat " + seat + " is booked by "
                    + passengers[seat - 1].getName() + ".");
            System.out.println("Fare: Rs." + fares[seat - 1]);
        } else {
            System.out.println("Seat " + seat + " is available.");
        }
    }

    void displayStatistics() {
        int booked = 0;
        double totalFare = 0;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                booked++;
                totalFare += fares[i];
            }
        }

        int available = seats.length - booked;

        System.out.println("\nTotal Seats     : " + seats.length);
        System.out.println("Booked Seats    : " + booked);
        System.out.println("Available Seats : " + available);
        System.out.println("Total Fare      : Rs." + totalFare);
    }

    void displayBookings() {
        System.out.println("\n--- BOOKED SEATS ---");
        boolean found = false;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                System.out.println("Seat " + (i + 1) + " : "
                        + passengers[i].getName()
                        + " | Fare: Rs." + fares[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No seats are currently booked.");
        }
    }

    int seatsLeft() {
        int booked = 0;

        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                booked++;
            }
        }

        return seats.length - booked;
    }
}

public class BusSeatManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Parameterized constructor
        Bus bus = new Bus(20);

        int choice;

        do {
            System.out.println("\n--- BUS SEAT MANAGEMENT ---");
            System.out.println("1. Display Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. Check Seat Availability");
            System.out.println("5. Display Seat Statistics");
            System.out.println("6. Display Bookings");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bus.displayAvailableSeats();
                    break;

                case 2:
                    System.out.print("\nEnter no of seats to book: ");
                    int num = sc.nextInt();

                    if (num > bus.seatsLeft()) {
                        System.out.println("Not enough seats available.");
                        System.out.println("Available number of seats: "
                                + bus.seatsLeft());
                        break;
                    }

                    System.out.println("\nSelect travelling distance:");
                    System.out.println("1. 1 - 5 km       : Rs.50");
                    System.out.println("2. 5 - 10 km      : Rs.100");
                    System.out.println("3. 10 - 15 km     : Rs.150");
                    System.out.println("4. 15 - 25 km     : Rs.200");
                    System.out.println("5. 25 km and above: Rs.300");

                    System.out.print("Enter your choice: ");
                    int distanceChoice = sc.nextInt();

                    double fare = 0;

                    switch (distanceChoice) {
                        case 1:
                            fare = 50;
                            break;

                        case 2:
                            fare = 100;
                            break;

                        case 3:
                            fare = 150;
                            break;

                        case 4:
                            fare = 200;
                            break;

                        case 5:
                            fare = 300;
                            break;

                        default:
                            System.out.println("Invalid distance choice.");
                            break;
                    }

                    if (fare == 0) {
                        break;
                    }

                    int i = 1;

                    while (i <= num) {
                        System.out.print("\nPassenger no: " + i);

                        System.out.print("\nEnter seat number to book: ");
                        int seat = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter passenger name: ");
                        String name = sc.nextLine();

                        // i increases only if booking is successful
                        i += bus.bookSeat(seat, name, fare);
                    }

                    break;

                case 3:
                    System.out.print("Enter seat number to cancel: ");
                    bus.cancelBooking(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter seat number to check: ");
                    bus.checkSeat(sc.nextInt());
                    break;

                case 5:
                    bus.displayStatistics();
                    break;

                case 6:
                    bus.displayBookings();
                    break;

                case 7:
                    System.out.println("       Thank you for using");
                    System.out.println("       Bus Seat Management!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}
