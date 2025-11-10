// SUV hierarchy
public abstract class SUV {
    public abstract String getSUVName();
    public abstract String getSUVFeatures();
}
class LuxurySUV extends SUV {
    private String name;
    public LuxurySUV(String sName) {
        this.name = sName;
    }
    @Override
    public String getSUVName() {
        return this.name;
    }
    @Override
    public String getSUVFeatures() {
        return "Luxury SUV Features";
    }
}
class NonLuxurySUV extends SUV {
    private String name;
    public NonLuxurySUV(String sName) {
        this.name = sName;
    }
    @Override
    public String getSUVName() {
        return this.name;
    }
    @Override
    public String getSUVFeatures() {
        return "Non-Luxury SUV Features";
    }
}