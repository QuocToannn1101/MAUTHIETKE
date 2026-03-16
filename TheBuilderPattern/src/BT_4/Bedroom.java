package BT_4;

public class Bedroom {

    private String bedType;
    private int numberOfBeds;
    private boolean tv;
    private boolean ac;
    private boolean bathroom;
    private String color;
    private int size;
    private boolean window;

    public Bedroom(String bedType, int numberOfBeds, boolean tv, boolean ac,
                   boolean bathroom, String color, int size, boolean window) {

        this.bedType = bedType;
        this.numberOfBeds = numberOfBeds;
        this.tv = tv;
        this.ac = ac;
        this.bathroom = bathroom;
        this.color = color;
        this.size = size;
        this.window = window;
    }

    @Override
    public String toString() {
        return "Phòng ngủ {" +
                "\nLoại giường: " + bedType +
                "\nSố giường: " + numberOfBeds +
                "\nCó TV: " + (tv ? "Có" : "Không") +
                "\nCó máy lạnh: " + (ac ? "Có" : "Không") +
                "\nCó phòng tắm: " + (bathroom ? "Có" : "Không") +
                "\nMàu tường: " + color +
                "\nDiện tích: " + size + " m2" +
                "\nCó cửa sổ: " + (window ? "Có" : "Không") +
                "\n}";
    }
}