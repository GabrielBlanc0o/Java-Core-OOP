interface Switchable {
    void turnOn();
    void turnOff();
}


interface Adjustable {
    void increase();
    void decrease();
}


interface Connectable {
     void connect();
    void disconnect();
}


class SmartBulb implements Switchable, Adjustable, Connectable {
    private boolean isOn = false;
    private int brightness = 50; // Default brightness level
    private boolean isConnected = false;

    // Switchable methods
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("SmartBulb is turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("SmartBulb is turned OFF.");
    }

    // Adjustable methods
    @Override
    public void increase() {
        if (brightness < 100) {
            brightness += 10;
            System.out.println("Brightness increased to " + brightness + "%.");
        } else {
            System.out.println("Brightness is already at maximum.");
        }
    }

    @Override
    public void decrease() {
        if (brightness > 0) {
            brightness -= 10;
            System.out.println("Brightness decreased to " + brightness + "%.");
        } else {
            System.out.println("Brightness is already at minimum.");
        }
    }

    // Connectable methods
    @Override
    public void connect() {
        isConnected = true;
        System.out.println("SmartBulb is connected to the network.");
    }

    @Override
    public void disconnect() {
        isConnected = false;
        System.out.println("SmartBulb is disconnected from the network.");
    }
}


class DimmableBulb implements Switchable, Adjustable {
    private boolean isOn = false;
    private int brightness = 50; 

    
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("DimmableBulb is turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("DimmableBulb is turned OFF.");
    }

    
    @Override
    public void increase() {
        if (brightness < 100) {
            brightness += 10;
            System.out.println("Brightness increased to " + brightness + "%.");
        } else {
            System.out.println("Brightness is already at maximum.");
        }
    }

    @Override
    public void decrease() {
        if (brightness > 0) {
            brightness -= 10;
            System.out.println("Brightness decreased to " + brightness + "%.");
        } else {
            System.out.println("Brightness is already at minimum.");
        }
    }
}


class RegularBulb implements Switchable {
    private boolean isOn = false;

    // Switchable methods
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("RegularBulb is turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("RegularBulb is turned OFF.");
    }
}
