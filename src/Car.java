public class Car {
    private String brand;
    private String model;
    private float price;

    public Car(String brand, String model, float price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void show(){
        System.out.println("Model: " + model + " Marka: " + brand);
    }
}
