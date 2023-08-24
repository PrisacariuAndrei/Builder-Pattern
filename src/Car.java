public class Car {

    private final int id;
    private final String brand;
    private final String model;
    private final int yearOfManufacture;
    private final int engineCapacity;
    private final int horsePower;
    private final String combustible;
    private final int mileage;
    private final String color;
    private final int numberOfDoors;

    public Car(CarBuilder builder) {
        this.id = builder.getId();
        this.brand = builder.getBrand();
        this.model = builder.getModel();
        this.yearOfManufacture = builder.getYearOfManufacture();
        this.engineCapacity = builder.getEngineCapacity();
        this.horsePower = builder.getHorsePower();
        this.combustible = builder.getCombustible();
        this.mileage = builder.getMileage();
        this.color = builder.getColor();
        this.numberOfDoors = builder.getNumberOfDoors();
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

    public String showBuild() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", engineCapacity=" + engineCapacity +
                ", horsePower=" + horsePower +
                ", combustible='" + combustible + '\'' +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
