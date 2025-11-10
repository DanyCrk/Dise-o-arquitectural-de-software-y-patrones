// Car hierarchy
public abstract class Car {
    public abstract String getCarName();
    public abstract String getCarFeatures();
}
class LuxuryCar extends Car {
    private String name;
    public LuxuryCar(String cName) {
        this.name = cName;
    }
    @Override
    public String getCarName() {
        return this.name;
    }
    @Override
    public String getCarFeatures() {
        return "Luxury Car Features";
    }
}
class NonLuxuryCar extends Car {
    private String name;
    public NonLuxuryCar(String cName) {
        this.name = cName;
    }
    @Override
    public String getCarName() {
        return this.name;
    }
    @Override
    public String getCarFeatures() {
        return "Non-Luxury Car Features";
    }
}