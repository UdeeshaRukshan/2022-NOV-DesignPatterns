package PastPapers.Question4;

public class Lunch extends Meal{
    public Lunch(){
        duration =new oneHour();
        flavour=new fishFlavour();
    }
    @Override
    void displayMeal() {
        System.out.println("Preparing Lunch......");
        mealWithFlavour();
        mealInDuration();
        double out=displayCost();
        System.out.println("Cost for the meal is:"+out);
        System.out.println();
    }

    @Override
    double displayCost() {
       return flavour.getCost();

    }

    @Override
    void mealWithFlavour() {
        flavour.addFlavour();
    }

    @Override
    void mealInDuration() {
        duration.deliveryTime();
    }
}
