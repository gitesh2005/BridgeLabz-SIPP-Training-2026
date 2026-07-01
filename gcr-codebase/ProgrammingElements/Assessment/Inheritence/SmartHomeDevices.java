package ProgrammingElements.Assessment.Inheritence;

class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        System.out.println("Thermostat Details");
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Device device1 = new Device("D101", "ON");
        Thermostat thermostat1 = new Thermostat("T201", "ON", 24.5);

        System.out.println("General Device Status:");
        device1.displayStatus();

        System.out.println();

        System.out.println("Smart Thermostat Status:");
        thermostat1.displayStatus();
    }
}
