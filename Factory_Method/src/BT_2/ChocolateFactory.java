package BT_2;

public class ChocolateFactory extends CandyFactory {

    @Override
    public Candy createCandy() {
        return new ChocolateCandy();
    }

}