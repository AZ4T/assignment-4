package Factory;

public class AppleFactory implements MegaZavod {
    @Override
    public Zavod createPhone(){
        return new Apple();
    }
}
