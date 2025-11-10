// VehicleFactory hierarchy
public abstract class VehicleFactory {
    public static final String LUXURY_VEHICLE = "Luxury";
    public static final String NON_LUXURY_VEHICLE = "Non-Luxury";
    public abstract Car getCar();
    public abstract SUV getSUV();
    public abstract Minivan getMiniVan();
    public static VehicleFactory getVehicleFactory(String tipo) {
        if (tipo.equals(LUXURY_VEHICLE)) {
            return new LuxuryVehicleFactory();
        }
        if (tipo.equals(NON_LUXURY_VEHICLE)) {
            return new NonLuxuryVehicleFactory();
        }
        return new LuxuryVehicleFactory();
    }
}
class LuxuryVehicleFactory extends VehicleFactory {
    @Override
    public Car getCar() {
        return new LuxuryCar("Luxury-Car");
    }
    @Override
    public SUV getSUV() {
        return new LuxurySUV("Luxury-SUV");
    }
    @Override
    public Minivan getMiniVan() {
        return new LuxuryMinivan("Luxury Mini-Van");
    }
}
class NonLuxuryVehicleFactory extends VehicleFactory {
    @Override
    public Car getCar() {
        return new NonLuxuryCar("Non Luxury-Car");
    }
    @Override
    public SUV getSUV() {
        return new NonLuxurySUV("Non Luxury-SUV");
    }
    @Override
    public Minivan getMiniVan() {
        return new NonLuxuryMinivan("Non Luxury-Mini-Van");
    }
}