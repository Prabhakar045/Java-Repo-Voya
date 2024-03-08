package vehicleInterfaceProject;

public class Car extends Vehicle implements IAccessories {
    String type;

    public Car(String brand, String model, double price) {

        super(brand, model, price);
    }

    void show(String type){
        System.out.println(type);
    }

    @Override
    public void showAccessories() {
        System.out.println("tyre");
    }

    @Override
    void getMileage() {
        System.out.println("35km mileage");
    }
}
