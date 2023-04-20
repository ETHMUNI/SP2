public class ElectricCar extends ACar {

    // Initialised getBatteryCapacityKWh & getMaxRangeKm after Tesla model S
    int getBatteryCapacityKWh; // returns the battery capacity in kilowatt hours

    int getMaxRangeKm; // returns the maximum range in kilometres.

    int getWhPrKm; // returns the power consumption in watt hours per driven kilometre.

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);
        this.getBatteryCapacityKWh = 103000;
        this.getMaxRangeKm = 531;
    }

    public int calWhPrKm() {
        this.getWhPrKm = (int) Math.round((double)this.getBatteryCapacityKWh / this.getMaxRangeKm / 91.25);
        return 100 / this.getWhPrKm;
    }

    public int getRegistrationFee() {
        return calWhPrKm();
    }

    @Override
    public String toString() {
        return super.toString() + "Battery capacity in wh: " + getBatteryCapacityKWh + "\n" + "Max. range in Km: " + getMaxRangeKm + "\n" + "Registration fee: " + getRegistrationFee() + "\n\n";
    }
}
