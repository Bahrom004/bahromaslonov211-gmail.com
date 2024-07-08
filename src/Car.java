public class Car {
    private String color;
    private String model;
    private double price;
    private boolean isAutomatic;
    public Car(String color, String model, double price, boolean  isAutomatic){
        this.color = color;
        this.model = model;
        this.price = price;
        this.isAutomatic = isAutomatic;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isAutomatic=" + isAutomatic +
                '}';
    }
}
