package AbstractFactory.Mobilephone;

import AbstractFactory.GPU;

public class reddragonGPU implements GPU{
    @Override
    public void performtasks(){
        System.out.println("GPU is working on low Voltage");
    }
}
