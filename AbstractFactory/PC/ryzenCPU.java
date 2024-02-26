package AbstractFactory.PC;

import AbstractFactory.CPU;

public class ryzenCPU implements CPU{
    @Override
    public void counttasks(){
        System.out.println("CPU is working on 70%");
    }
}
