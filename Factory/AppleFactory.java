package Factory;

public class AppleFactory implements MegaZavod {
    @Override
    public Zavod createMarket(){
        return new Apple();
    }
}
