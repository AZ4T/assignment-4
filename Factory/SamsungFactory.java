package Factory;

public class SamsungFactory implements MegaZavod {
    @Override
    public Zavod createPhone(){
        return new Samsung();
    }
}
