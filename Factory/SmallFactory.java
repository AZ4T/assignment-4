package Factory;

public class SmallFactory implements Supermarket{
    @Override
    public Market createMarket(){
        return new Small();
    }
}
