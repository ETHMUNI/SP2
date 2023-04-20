public class GasolineCar extends AFuelCar {

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);
    }

    @Override
    String getFuelType() {
        return "Gasoline";
    }


    public int getRegistrationFee() {
        kmPrLitre = 23;
        if(kmPrLitre >= 20 && kmPrLitre <= 50) {
            return 330;
        } else if(kmPrLitre >= 15 && kmPrLitre < 20) {
            return 1050;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            return 2340;
        } else if(kmPrLitre >= 5 && kmPrLitre < 10) {
            return 5500;
        } else if(kmPrLitre < 5) {
            return 10470;
        }
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + "Registration Fee: " + getRegistrationFee() + "\n\n";
    }
}
/* Hvis den kører mellem 20 km/l og 50 km/l er prisen 330 kr, mellem 15 km/l og 20 km/l er prisen 1050 kr,
 mellem 10 km/l og 15 km/l er prisen 2340 kr, mellem 5 km/l og 10 km/l er prisen 5500kr,
 og under 5 km/l er prisen 10470 kr*/