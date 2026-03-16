package BT_3;

public class BikeBuilder {

    public static void main(String[] args) {

        BikeFactory factory;

        // Chọn loại bike
        factory = new MountainBikeFactory();

        Wheel wheel = factory.getWheel();

        wheel.build();

        // Test thêm loại khác
        factory = new RoadBikeFactory();
        wheel = factory.getWheel();
        wheel.build();

        // Exercise 3c
        factory = new ElectricBikeFactory();
        wheel = factory.getWheel();
        wheel.build();

    }

}