public class mobilePhone {
    private int id;
    private int price;
    private int discountRate;
    private int stockQuantity;
    private String name;
    private int ram;
    private int storage;
    private double screenDimension;
    private int battery;
    private String colour;
    private String brand;


    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setScreenDimension(double screenDimension) {
        this.screenDimension = screenDimension;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public mobilePhone (int id , String name, int price, String brand, int discountRate, int ram, int storage, double screenDimension, int stockQuantity, int battery, String colour){
        this.id=id;
        this.discountRate=discountRate;
        this.name=name;
        this.ram=ram;
        this.price=price;
        this.storage=storage;
        this.screenDimension=screenDimension;
        this.stockQuantity=stockQuantity;
        this.battery=battery;
        this.colour=colour;
        this.brand=brand;





    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenDimension() {
        return screenDimension;
    }

    public void setScreenDimension(int screenDimension) {
        this.screenDimension = screenDimension;
    }
}
