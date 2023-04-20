abstract public class AFuelCar extends ACar {

    int kmPrLitre;
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre();
    }

    abstract String getFuelType();  // should return “Gasoline” or “Diesel”

    public int kmPrLitre() { // should return how many kilometres the car can drive on 1 litre of fuel
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + "Fuel type: " + getFuelType() + "\n";
    }
}
