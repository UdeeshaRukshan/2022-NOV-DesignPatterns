package PastPapers.Question4;

public class Dinner extends Meal{
    public Dinner(){
        duration =new fourtyFiveMinutes();
        flavour=new eggFlavour();

    }

    @Override
    void displayMeal() {
        System.out.println("Preparing Dinner......");
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
