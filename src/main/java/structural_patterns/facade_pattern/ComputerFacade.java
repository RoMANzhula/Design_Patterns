package structural_patterns.facade_pattern;

public class ComputerFacade {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void startComputer() {
        try {
            cpu.start();
            memory.load();
            hardDrive.read();
            System.out.println("Computer is running.");
        } catch (Exception e) {
            System.out.println("Error during computer startup: " + e.getMessage());
        }
    }

}
