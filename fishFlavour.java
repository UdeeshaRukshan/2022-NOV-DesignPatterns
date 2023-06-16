package PastPapers.Question4;

public class fishFlavour implements IprepareDeliciously {
    @Override
    public void addFlavour() {
        System.out.println("Added fish for the meal");
    }

    @Override
    public double getCost() {
        return 80.0;
    }
}
