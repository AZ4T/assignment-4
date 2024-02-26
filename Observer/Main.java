package Observer;

public class Main {
    public static void main(String[] args) {
        Notifications notifications = new Notifications();

        notifications.addNot("Be Aware!");
        notifications.addNot("Aggressive dog!");

        Observer Azat = new Subscriber("Azat");
        Observer Biba = new Subscriber("Biba");

        notifications.addObserver(Azat);
        notifications.addObserver(Biba);

        notifications.removeNot("Be Aware!");
    }
}