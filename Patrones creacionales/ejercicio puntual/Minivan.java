// Minivan hierarchy
public abstract class Minivan {
    public abstract String getMinivanName();
    public abstract String getMinivanFeatures();
}
class LuxuryMinivan extends Minivan {
    private String name;
    
    public LuxuryMinivan(String mName) {
        this.name = mName;
    }
    @Override
    public String getMinivanName() {
        return this.name;
    }
    @Override
    public String getMinivanFeatures() {
        return "Luxury Mini-Van features";
    }
}
class NonLuxuryMinivan extends Minivan {
    private String name;
    
    public NonLuxuryMinivan(String mName) {
        this.name = mName;
    }
    @Override
    public String getMinivanName() {
        return this.name;
    }
    @Override
    public String getMinivanFeatures() {
        return "Non-luxury Mini-Van Features";
    }
}