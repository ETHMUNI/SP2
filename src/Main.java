public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        GasolineCar car1 = new GasolineCar("12345", "Mazda 3", "Skyactiv", 5);
        DieselCar car2 = new DieselCar("67890", "Peugeot", "208", 5 );
        ElectricCar car3 = new ElectricCar("01234","Tesla", "Model S", 5);

        // Adding cars to array
        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);

        System.out.println(fleet);
        System.out.println("Total registration fee for fleet: " + fleet.getTotalRegistrationFeeForFleet());
    }
}