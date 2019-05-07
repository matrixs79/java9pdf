package zadanieAlkohol;

public class Alcohol {
    private String name;
    private float strength;

    public Alcohol() {}

    public Alcohol(String name, float strength) {
        this.name = name;
        this.strength = strength;
    }

    public float calculatePerMil(int quantity, int weight, boolean male) {
        float a  = quantity * strength * 0.8f;
        float k = male ? 0.7f : 0.6f;
        return a / (k * weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStrength() {
        return strength;
    }

    public void setStrength(float strength) {
        this.strength = strength;
    }
}
