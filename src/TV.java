import java.util.*;


class TV
{
    String brand;
    int size;
    int price;

    public TV(String brand, int size, int price)
    {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    double calculateDiscount()
    {
        double Discountpercent = 0;

        if (size >= 50)
        {
            Discountpercent = 10;
        }

        return  price * (Discountpercent /100);

    }


    void printDetails() {
        System.out.println("TV Details");
        System.out.println();
        System.out.println("TV's brand: " + brand);
        System.out.println("TV's size: " + size+ " inches");
        System.out.println("TV's price: " + price + "Rs");
        System.out.println("Discounted Price: " + (price - calculateDiscount()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the brand of TV: ");
        String brand = sc.nextLine();

        System.out.print("Enter the size of TV: ");
        int size= sc.nextInt();

        System.out.print("Enter the price of TV: ");
        int price = sc.nextInt();

        System.out.println();

        TV tv = new TV(brand, size, price);

        tv.printDetails();
    }
}
