import java.util.*;


class Shirt
{
    String size;
    String colour;
    int price;

    public Shirt(String size, String colour, int price)
    {
        this.size = size;
        this.colour = colour;
        this.price = price;
    }

    double calculateDiscount()
    {
        double Discountpercent = 0;

        if (size.equals("xxl") || size.equals("xl"))
        {
            Discountpercent = 20;
        }
        else if (size.equals("l"))
        {
            Discountpercent = 15;
        }
        else
        {
            Discountpercent = 10;
        }

        return  price * (Discountpercent /100);

    }


    void printDetails() {
        System.out.println("Shirt Details");
        System.out.println();
        System.out.println("Shirt's size: " + size);
        System.out.println("Shirt's colour: " + colour);
        System.out.println("Shirt's price: Rs. " + price );
        System.out.println("Discounted Price: Rs. " + (price - calculateDiscount()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of shirt: ");
        String size = sc.nextLine();

        System.out.print("Enter the colour of Shirt: ");
        String colour = sc.nextLine();

        System.out.print("Enter the price of Shirt: ");
        int price = sc.nextInt();

        System.out.println();

        Shirt S = new Shirt(size, colour, price);

        S.printDetails();
    }
}
