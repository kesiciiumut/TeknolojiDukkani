public class notebook {


    private int id;
    private int price;
    private int discountRate;
    private int stockQuantity;
    private String name;
    private int ram;
    private int storage;
    private double screenDimension;
    private String brand;

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

    public void setScreenDimension(double screenDimension) {
        this.screenDimension = screenDimension;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public notebook(int id,String name, int price, String brand, int discountRate, int stockQuantity, int ram, int storage, double screenDimension) {
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.stockQuantity = stockQuantity;
        this.name = name;
        this.ram = ram;
        this.storage = storage;
        this.screenDimension = screenDimension;
        this.brand=brand;

    }
}
