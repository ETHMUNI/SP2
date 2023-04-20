import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleet;

    public FleetOfCars() {
        fleet = new ArrayList<Car>();
    }

    public void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFee = 0;
        for(Car car : fleet) {
            totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    @Override
    public String toString() {
        for(Car car : fleet) {
            car.toString();
        }
        return "Car fleet: " + fleet.toString();
    }
}
