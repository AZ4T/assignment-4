package AbstractFactory;

import AbstractFactory.Mobilephone.PhoneParts;

public class Phone {
    public static void main(String[] args){
        Device device = new PhoneParts();
        CPU cpu = device.getCPU();
        GPU gpu = device.getGPU();
        RAM ram = device.getRAM();

        System.out.println("You got new message!");
        cpu.counttasks();
        gpu.performtasks();
        ram.collecttasks();

    }
}
