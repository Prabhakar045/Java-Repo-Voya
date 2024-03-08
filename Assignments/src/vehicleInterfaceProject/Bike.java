package vehicleInterfaceProject;

public class Bike extends Vehicle implements IExternal{

    String capacity;

    public Bike(String brand, String model, double price) {
        super(brand, model, price);
    }

    void showCapacity(String capaciity){
        System.out.println(capacity);
    }
    @Override
    public void showAccessories() {
        System.out.println("accessories");
    }

    @Override
    public void exterior() {
        System.out.println("bike exterior");
    }

    @Override
    void getMileage() {
        System.out.println("bike mileage");
    }
}
