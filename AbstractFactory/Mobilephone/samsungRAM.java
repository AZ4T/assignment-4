package AbstractFactory.Mobilephone;

import AbstractFactory.RAM;

public class samsungRAM implements RAM{
    @Override
    public void collecttasks(){
        System.out.println("2gb of information uploading");
    }
}
