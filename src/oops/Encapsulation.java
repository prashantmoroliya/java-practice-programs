package oops;

public class Encapsulation {
    private final String manufacturer;
    private final String operatingSystem;
    private final String version;
    private final int cost;

    // Constructor to set properties/characteristics of object;
    Encapsulation(String manufacturer, String operatingSystem, String version, int cost) {
        this.manufacturer=manufacturer;
        this.operatingSystem=operatingSystem;
        this.version=version;
        this.cost=cost;
    }

    // method to get access Model property of Object;
    public String getVersion() {
        return this.version;
    }

    // method to get access Manufacturer property of Object;
    public String getManufacturer() {
        return this.manufacturer;
    }

    // method to get access Cost property of Object;
    public int getCost() {
        return this.cost;
    }

    // method to get access OperatingSystem property of Object;
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public static void main(String[] args) {
        Encapsulation en=new Encapsulation("Microsoft", "Windows 11", "22H2", 6500);
        System.out.println("Manufacturer: "+en.getManufacturer());
        System.out.println("Operating System: "+en.getOperatingSystem());
        System.out.println("Model: "+en.getVersion());
        System.out.println("Cost: "+en.getCost());
    }
}
