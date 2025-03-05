public class cpu{
    private double price;
    
   
    class Processor {
        private int numberOfCores;
        private String manufacturer;

        
        public Processor(int numberOfCores, String manufacturer) {
            this.numberOfCores = numberOfCores;
            this.manufacturer = manufacturer;
        }

        
        public void displayProcessorInfo() {
            System.out.println("Processor: ");
            System.out.println("Number of Cores: " + numberOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    
    static class RAM {
        private int memory; // in GB
        private String manufacturer;

        
        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public void displayRAMInfo() {
            System.out.println("RAM: ");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

   
    public cpu(double price) {
        this.price = price;
    }

   
    public void displayPrice() {
        System.out.println("CPU Price: $" + price);
    }

    public static void main(String[] args) {
        cpu myCPU = new cpu(500.00);
        
        
        cpu.Processor myProcessor = myCPU.new Processor(8, "Intel");
        
        
        cpu.RAM myRAM = new cpu.RAM(16, "Corsair");

        
        myCPU.displayPrice();        
        myProcessor.displayProcessorInfo();
        myRAM.displayRAMInfo();       
    }
}

