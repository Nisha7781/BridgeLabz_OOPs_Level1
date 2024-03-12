import java.util.*;

class Computer
{
    String processor;
    int RAM;
    int storage;
    public Computer(String processor, int RAM, int storage)
    {
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
    }

    double calculatePrice()
    {
        double basePrice = 50000;
        double processorPrice = processor.equalsIgnoreCase("i7") ? 3000 : 0;
        double RAMPrice = RAM * 10;
        double storagePrice = storage * 0.2;
        return basePrice + processorPrice + RAMPrice + storagePrice;
    }

    void printDetails() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: Rs." + calculatePrice());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the processor type: ");
        String processor = sc.nextLine();

        System.out.print("Enter the RAM capacity: ");
        int RAM = sc.nextInt();

        System.out.print("Enter the storage capacity: ");
        int storage = sc.nextInt();

        Computer C = new Computer(processor, RAM, storage);
        C.printDetails();
    }
}
