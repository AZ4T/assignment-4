package AbstractFactory.PC;

import AbstractFactory.RAM;
import AbstractFactory.CPU;
import AbstractFactory.GPU;
import AbstractFactory.Device;

public class ComputerParts implements Device{
    @Override
    public RAM getRAM(){
        return new hynixRAM();
    }
    @Override
    public CPU getCPU(){
        return new ryzenCPU();
    }

    @Override
    public GPU getGPU(){
        return new nvidiaGPU();
    }
}
