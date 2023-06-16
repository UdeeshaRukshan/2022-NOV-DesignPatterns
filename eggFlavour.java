package PastPapers.Question4;

public class eggFlavour implements IprepareDeliciously {

    @Override
    public void addFlavour() {
        System.out.println("Added egg for the meal");
    }

    @Override
    public double getCost() {
        return 60.0;
    }
}
