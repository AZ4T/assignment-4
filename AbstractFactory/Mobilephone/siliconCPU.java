package AbstractFactory.Mobilephone;

import AbstractFactory.CPU;

public class siliconCPU implements CPU{
    @Override
    public void counttasks(){
        System.out.println("CPU is working on high temperatures");
    }
}
