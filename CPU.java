public class CPU {
    private double price;

    public CPU(double price) {
        this.price = price;
    }

    public void displayPrice() {
        System.out.println("CPU Price: " + price);
    }

    public class Processor {
        private int cores;
        private String manufacturer;

        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        public void displayProcessorInfo() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    public static class RAM {
        private int memory;
        private String manufacturer;

        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public void displayRAMInfo() {
            System.out.println("RAM Memory: " + memory + " GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(500.0);
        CPU.Processor processor = cpu.new Processor(8, "Intel");
        CPU.RAM ram = new CPU.RAM(16, "Corsair");

        cpu.displayPrice();
        processor.displayProcessorInfo();
        ram.displayRAMInfo();
    }
}
