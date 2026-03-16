package BT_4;

public class Main {

    public static void main(String[] args) {

        BedroomBuilder builder = new BedroomBuilder();

        Architect architect = new Architect();

        architect.constructLuxuryBedroom(builder);

        Bedroom bedroom = builder.build();

        System.out.println(bedroom);
    }
}