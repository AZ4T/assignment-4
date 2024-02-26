package Factory;

public class SamsungFactory implements MegaZavod {
    @Override
    public Zavod createMarket(){
        return new Samsung();
    }
}
