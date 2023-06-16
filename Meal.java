package PastPapers.Question4;

abstract class Meal {
    IprepareQuickely duration;
    IprepareDeliciously flavour;

    public void setFlavour(IprepareDeliciously flavour){
        this.flavour=flavour;

    }
    public void setDuration(IprepareQuickely duration){
        this.duration=duration;

    }
    abstract void displayMeal();
    abstract double displayCost();

    abstract void mealWithFlavour();
    abstract void mealInDuration();
}
