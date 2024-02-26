package AbstractFactory.PC;

import AbstractFactory.RAM;

public class hynixRAM implements RAM{
    @Override
    public void collecttasks(){
        System.out.println("Only 8gb out of 16gb are filled");
    }
}
