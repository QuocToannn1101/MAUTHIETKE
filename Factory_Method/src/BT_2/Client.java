package BT_2;

public class Client {

    public static void main(String[] args) {

        CandyFactory chocolateFactory = new ChocolateFactory();
        CandyStore store1 = new CandyStore(chocolateFactory);

        store1.orderCandy();

        CandyFactory mintFactory = new MintFactory();
        CandyStore store2 = new CandyStore(mintFactory);

        store2.orderCandy();

    }

}