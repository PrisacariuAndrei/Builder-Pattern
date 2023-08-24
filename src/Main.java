public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        director.buildMazda(builder);
        Car car1 = builder.build();

        Car car2 = new CarBuilder()
                .id(1)
                .model("Mk5")
                .brand("Ford")
                .color("black")
                .horsePower(200)
                .combustible("Diesel")
                .engineCapacity(2000)
                .numberOfDoors(5)
                .build();

        System.out.println(car1.showBuild());
        System.out.println(car2.showBuild());
    }
}