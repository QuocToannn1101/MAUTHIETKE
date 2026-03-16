package BT_2;

public class CandyStore {

    private CandyFactory factory;

    public CandyStore(CandyFactory factory) {
        this.factory = factory;
    }

    public void orderCandy() {

        Candy candy = factory.createCandy();

        System.out.println("Creating: " + candy.getCandyName());
    }

}