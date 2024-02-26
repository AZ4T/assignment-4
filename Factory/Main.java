package Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String market = sc.next();
        MegaZavod supermarket = marketdefiner(market);
        Zavod markett = supermarket.createMarket();
        markett.trade();
    }
    public static MegaZavod marketdefiner(String definer){
        if(definer.equalsIgnoreCase("Small market")){
            return new SamsungFactory();
        } else if(definer.equalsIgnoreCase("Magnum market")){
            return new AppleFactory();
        } else{
            System.out.println("There is no such market");
        }
        return null;
    }
}
