package PastPapers.Question4;

public class Breakfast extends Meal{
    public Breakfast(){
        duration =new thirtyMinutes();
        flavour=new chickenFlavour();
    }
    @Override
    void displayMeal() {
        System.out.println("Preparing Breakfast......");
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
