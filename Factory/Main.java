package Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String phone = sc.next();
        MegaZavod megaZavod = phonedefiner(phone);
        Zavod phonee = megaZavod.createPhone();
        phonee.trade();
    }
    public static MegaZavod phonedefiner(String definer){
        if(definer.equalsIgnoreCase("Samsung")){
            return new SamsungFactory();
        } else if(definer.equalsIgnoreCase("Apple")){
            return new AppleFactory();
        } else{
            System.out.println("There is no such phone");
        }
        return null;
    }
}
