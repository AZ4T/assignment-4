package Strategy;

public class Drink {
    Drinkcup drinkcup;

    public void setDrink(Drinkcup drinkcup){
        this.drinkcup = drinkcup;
    }

    public void drinkit(){
        drinkcup.dodrink();
    }
}
