public class DieselCar extends AFuelCar {

    boolean particleFilter;
    int particleFilterFee;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);
        this.particleFilterFee = 1000;
    }

    @Override
    String getFuelType() {
        return "Diesel";
    }
    public int getRegistrationFee() {

        kmPrLitre = 0;
        if(kmPrLitre >= 20 && kmPrLitre <= 50) {
            return 130;
        } else if(kmPrLitre >= 15 && kmPrLitre < 20) {
            return 1390;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            return 1850;
        } else if(kmPrLitre >= 5 && kmPrLitre < 10) {
            return 2770;
        } else if(kmPrLitre < 5) {
            return 15260;
        }
        return kmPrLitre;
    }

    // Should be datatype boolean, but can't get it to work so I have used an String
    String hasParticleFilter() {
        if(!particleFilter) {
            return "No, you have to pay " + particleFilterFee;
        } else {
            return "Yes";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Does it have a particle filter? " + hasParticleFilter() + "\n" + "Registration Fee: " + getRegistrationFee()+ "\n\n";
    }
}
/*  Hvis bilen kører mellem 20 km/l og 50 km/l er udligningsafgiften 130 kr,
kører den mellem 15 km/l og 20 km/l er den 1390 kr, kører den mellem 10 km/l og 15 km/l er den 1850 kr,
kører den mellem 5 km/l og 10 km/l er den 2770 kr, og kører den under 5 km/l er den 15260 kr.
Der er desuden en partikeludledningsafgift på 1000 kr hvis bilen ikke har et partikelfilter monteret.*/