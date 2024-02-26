package AbstractFactory;

public interface Device {
    CPU getCPU();
    GPU getGPU();
    RAM getRAM();
}
