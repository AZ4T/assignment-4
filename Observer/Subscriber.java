package Observer;

import javax.swing.event.MenuDragMouseListener;
import java.util.List;

public class Subscriber implements Observer{
    String name;
    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void notifyEvent(List<String> not) {
        System.out.println("Hello !" + name);
        System.out.println(not);
        System.out.println();
    }


}