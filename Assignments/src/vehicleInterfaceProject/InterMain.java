package vehicleInterfaceProject;

public class InterMain {

    public static void main(String[] args) {

        System.out.println("Car: ");
        Vehicle car = new Car("Baleno","Suzuki",1200000.0);
        car.getMileage();
        car.insuranceDetails();
        car.getDetails();

        Insurance insurance=new Car("","",5000.0);
        insurance.insuranceDetails();

        Car car1 = (Car) car;
        car1.show("Sports");

        System.out.println("Bike: ");
        Vehicle bike = new Bike("Hunter","Bullet",200000.0);
        bike.getDetails();
        bike.insuranceDetails();
        bike.getMileage();

    }
}
