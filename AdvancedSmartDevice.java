public class AdvancedSmartDevice {
    public static void main(String[] args) {

        // Creating SmartTV object
        SmartTV tv = new SmartTV();

        tv.turnOn();
        tv.increaseVolume();
        tv.decreaseVolume();
        tv.connectWiFi();
        tv.showNetworkStatus();
        tv.turnOff();

        System.out.println("\n--- Interface Reference ---");

        // Reference to extended interface
        SmartControllable control = tv;
        control.turnOn();
        control.increaseVolume();
        control.turnOff();

        System.out.println("\n--- Nested Interface Reference ---");

        Connectable.NetworkStatus status = tv;
        status.showNetworkStatus();
    }
}

interface Switchable {
    void turnOn();
    void turnOff();
}

// Interface extending another interface
interface SmartControllable extends Switchable {
    void increaseVolume();
    void decreaseVolume();
}

// Interface containing a nested interface
interface Connectable {
    void connectWiFi();

    // Nested interface
    interface NetworkStatus {
        void showNetworkStatus();
    }
}

// SmartTV implements two interfaces and a nested interface
class SmartTV implements SmartControllable, Connectable,
        Connectable.NetworkStatus {

    @Override
    public void turnOn() {
        System.out.println("Smart TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is turned OFF");
    }

    @Override
    public void increaseVolume() {
        System.out.println("TV volume increased");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("TV volume decreased");
    }

    @Override
    public void connectWiFi() {
        System.out.println("Smart TV connected to Wi-Fi");
    }

    @Override
    public void showNetworkStatus() {
        System.out.println("Network Status: Connected");
    }
}





