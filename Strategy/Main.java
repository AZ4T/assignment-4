package Strategy;

public class Main {
    public static void main(String[] args){
        Drink drinkable = new Drink();

        drinkable.setDrink(new Coffee());
        drinkable.drinkit();

        drinkable.setDrink(new Tea());
        drinkable.drinkit();

        drinkable.setDrink(new Juice());
        drinkable.drinkit();

    }
}