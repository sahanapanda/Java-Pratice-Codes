public class VehicleRentalSystem {
public static void main(String[] args) {

Vehicle v1 = new Car("TS09AB1234", "Hyundai", 2500);
Vehicle v2 = new Bike("TS10XY4567", "Honda", 800);
Vehicle v3 = new Bus("TS11CD7890", "Volvo", 6000);

v1.displayVehicle();
v1.calculateRent(4);

v2.displayVehicle();
v2.calculateRent(5);

v3.displayVehicle();
v3.calculateRent(2);
}
}
// Abstract Class (Abstraction)
abstract class Vehicle {
// Encapsulation (Private Data Members)
private String vehicleNumber;
private String brand;
private double rentPerDay;

// Constructor
Vehicle(String vehicleNumber, String brand, double rentPerDay) {
this.vehicleNumber = vehicleNumber;
this.brand = brand;
this.rentPerDay = rentPerDay;
}

// Getters (Encapsulation)
public String getVehicleNumber() {
return vehicleNumber;
}
public String getBrand() {
return brand;
}
public double getRentPerDay() {
return rentPerDay;
}
// Abstract Method (Abstraction)
abstract void calculateRent(int days);

// Common Method
void displayVehicle() {
System.out.println("--------------------------------");
System.out.println("Vehicle Number : " + vehicleNumber);
System.out.println("Brand : " + brand);
System.out.println("Rent Per Day : Rs." + rentPerDay);
}
}

// Inheritance
class Car extends Vehicle {
Car(String number, String brand, double rent) {
super(number, brand, rent);
}
// Polymorphism (Method Overriding)
@Override
void calculateRent(int days) {
double total = getRentPerDay() * days;
System.out.println("Car Rent for " + days + " days = Rs." + total);
}
}
// Inheritance
class Bike extends Vehicle {
Bike(String number, String brand, double rent) {
super(number, brand, rent);
}
// Polymorphism (Method Overriding)
@Override
void calculateRent(int days) {
double total = getRentPerDay() * days;
System.out.println("Bike Rent for " + days + " days = Rs." + total);
}
}
// Inheritance
class Bus extends Vehicle {
Bus(String number, String brand, double rent) {
super(number, brand, rent);
}

// Polymorphism (Method Overriding)
@Override
void calculateRent(int days) {
double total = getRentPerDay() * days;
System.out.println("Bus Rent for " + days + " days = Rs." + total);
}
}
