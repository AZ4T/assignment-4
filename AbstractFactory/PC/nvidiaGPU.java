package AbstractFactory.PC;

import AbstractFactory.GPU;

public class nvidiaGPU implements GPU{
    @Override
    public void performtasks(){
        System.out.println("GPU is working on 20%");
    }
}
