package BT_2;

public class MintFactory extends CandyFactory {

    @Override
    public Candy createCandy() {
        return new MintCandy();
    }

}