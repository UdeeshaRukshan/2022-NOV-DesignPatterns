package PastPapers.Question4;

public class chickenFlavour implements IprepareDeliciously {
    @Override
    public void addFlavour() {
        System.out.println("Added Chicken for the meal");
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
