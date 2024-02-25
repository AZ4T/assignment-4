package AbstractFactory.Mobilephone;

import AbstractFactory.CPU;
import AbstractFactory.RAM;
import AbstractFactory.GPU;
import AbstractFactory.Device;

public class PhoneParts implements Device{
    @Override
    public CPU getCPU(){
        return new siliconCPU();
    }
    @Override
    public GPU getGPU(){
        return new reddragonGPU();
    }
    @Override
    public RAM getRAM(){
        return new samsungRAM();
    }
}
