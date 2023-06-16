package PastPapers.Question4;

public class TestStrategy {
    public static void main(String[] args){

        Meal meal=new Breakfast();
        meal.setFlavour(new chickenFlavour());
        meal.setDuration(new thirtyMinutes());
        meal.displayMeal();

        Meal meal2=new Lunch();
        meal2.setFlavour(new fishFlavour());
        meal2.setDuration(new oneHour());
        meal2.displayMeal();

        Meal meal3=new Dinner();
        meal3.setFlavour(new eggFlavour());
        meal3.setDuration(new fourtyFiveMinutes());
        meal3.displayMeal();
    }
}
