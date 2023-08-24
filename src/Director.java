public class Director {

    public void buildAudi(CarBuilder builder) {
        builder.brand("Audi")
                .model("A4")
                .engineCapacity(1800)
                .combustible("Diesel")
                .horsePower(170);
    }

    public void buildMazda(CarBuilder builder) {
        builder.brand("Mazda")
                .model("6")
                .engineCapacity(2200)
                .combustible("Gas")
                .horsePower(150);
    }
}
