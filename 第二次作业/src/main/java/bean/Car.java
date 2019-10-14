package bean;

public class Car {
    private String color;
    private String brand;
    private float gas;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getGas() {
        return gas;
    }

    public void setGas(float gas) {
        this.gas = gas;
    }

    public Car(String color, String brand, float gas) {
        this.color = color;
        this.brand = brand;
        this.gas = gas;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", gas=" + gas +
                '}';
    }
}
