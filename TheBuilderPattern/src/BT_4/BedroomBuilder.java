package BT_4;

public class BedroomBuilder implements Builder {

    private String bedType;
    private int numberOfBeds;
    private boolean tv;
    private boolean ac;
    private boolean bathroom;
    private String color;
    private int size;
    private boolean window;

    @Override
    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    @Override
    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void setTV(boolean tv) {
        this.tv = tv;
    }

    @Override
    public void setAC(boolean ac) {
        this.ac = ac;
    }

    @Override
    public void setBathroom(boolean bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setWindow(boolean window) {
        this.window = window;
    }

    public Bedroom build() {
        return new Bedroom(bedType, numberOfBeds, tv, ac, bathroom, color, size, window);
    }
}