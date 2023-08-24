public class CarBuilder {

    private int id;
    private String brand;
    private String model;
    private int yearOfManufacture;
    private int engineCapacity;
    private int horsePower;
    private String combustible;
    private int mileage;
    private String color;
    private int numberOfDoors;

    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }

    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder yearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
        return this;
    }

    public CarBuilder engineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
        return this;
    }

    public CarBuilder horsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public CarBuilder combustible(String combustible) {
        this.combustible = combustible;
        return this;
    }

    public CarBuilder mileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder numberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public Car build() {
        return new Car(this);
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getCombustible() {
        return combustible;
    }

    public int getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
