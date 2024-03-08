package vehicleInterfaceProject;

public abstract class Vehicle implements Insurance{

    String brand;
    String model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void getDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("price: "+price);
    }

    abstract void getMileage();


    @Override
    public void insuranceDetails() {
        System.out.println("insurance details");
    }
}
