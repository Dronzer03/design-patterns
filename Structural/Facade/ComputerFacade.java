public class ComputerFacade {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private OperatingSystem os = new OperatingSystem();

    public void startComputer() {
        System.out.println("Starting Computer");
        cpu.start();
        memory.load();
        os.load();
        System.out.println("Computer Started");
    }

    public void shutDown() {
        System.out.println("Starting shutdown");
        os.saveContext();
        memory.clear();
        os.close();
        cpu.shutdown();
        System.out.println("Shutdown Complete");
    }
}
