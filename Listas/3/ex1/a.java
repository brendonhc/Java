public interface Device {
    void turnOn();
    void turnOff();
    int statusCheck();
    void calibrate();
}

public class Video implements Device {
    void turnOn() {
        // implementação...
    }

    void turnOff() {
        // implementação...
    }

    int statusCheck() {
        // implementação...
    }

    void calibrate() {
        // implementação...
    }
}

// O mesmo para os outros dispositivos... Mouse, Keyboard, Printer.
