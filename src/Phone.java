import java.util.*;


class Phone
{
    String make;
    String model;
    int storage;

    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    double calculatePrice()
    {
        double base_price = 30000;
        double make_price = 0.2 * base_price;
        double model_price = 0.3 * base_price;
        double storage_Price = 0.25 * base_price;

        return (base_price + make_price + model_price + storage_Price);

    }


    void printDetails() {
        System.out.println("Phone Details");
        System.out.println();
        System.out.println("Phone's make: " + make);
        System.out.println("Phone's model: " + model);
        System.out.println("Phone's Storage: " + storage + "GB");
        System.out.println("Phone's Price: " + calculatePrice());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the make of phone: ");
        String make = sc.nextLine();

        System.out.print("Enter the model of phone: ");
        String model= sc.nextLine();

        System.out.print("Enter the Storage capacity of phone: ");
        int storage = sc.nextInt();

        System.out.println();

        Phone P = new Phone(make, model, storage);

        P.printDetails();
    }
}
