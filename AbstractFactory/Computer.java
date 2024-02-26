package AbstractFactory;

import AbstractFactory.PC.ComputerParts;

public class Computer {
    public static void main(String[] args){
        Device device = new ComputerParts();
        CPU cpu = device.getCPU();
        GPU gpu = device.getGPU();
        RAM ram = device.getRAM();

        System.out.println("Loading");
        cpu.counttasks();
        gpu.performtasks();
        ram.collecttasks();
    }
}
