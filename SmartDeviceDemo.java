public class SmartDeviceDemo {
    public static void main(String[] args) {

        // Creating SmartLight object
        SmartLight light = new SmartLight();
        light.turnOn();
        light.setBrightness(75);
        light.turnOff();

        System.out.println();

        // Creating SmartFan object
        SmartFan fan = new SmartFan();
        fan.turnOn();
        fan.turnOff();

        System.out.println();

        // Interface reference
        Switchable device = new SmartLight();
        device.turnOn();
        device.turnOff();

        System.out.println();

        // Interface reference for Dimmable
        Dimmable dimmer = new SmartLight();
        dimmer.setBrightness(50);
    }
}

interface Switchable {
    void turnOn();
    void turnOff();
}

interface Dimmable {
    void setBrightness(int level);
}

class SmartLight implements Switchable, Dimmable {
    private int brightness;

    @Override
    public void turnOn() {
        System.out.println("Smart Light is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Light is turned OFF");
    }

    @Override
    public void setBrightness(int level) {
        brightness = level;
        System.out.println("Light brightness set to " + brightness + "%");
    }
}

class SmartFan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Smart Fan is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Fan is turned OFF");
    }
}
