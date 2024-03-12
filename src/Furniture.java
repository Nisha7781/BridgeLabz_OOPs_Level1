import java.util.*;


class Furniture
{
    String type;
    String material;
    int price;

    public Furniture(String type, String material, int price)
    {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    double calculateDiscount()
    {
        double Discountpercent = 0;

        if (material.equals("wood"))
        {
            Discountpercent = 5;
        }
        else if (material.equals("glass"))
        {
            Discountpercent = 10;
        }

        return  price * (Discountpercent /100);

    }


    void printDetails() {
        System.out.println("Furniture Details");
        System.out.println();
        System.out.println("Furniture type: " + type);
        System.out.println("Furniture Material: " + material);
        System.out.println("Furniture price: Rs. " + price );
        System.out.println("Discounted Price: Rs. " + (price - calculateDiscount()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the type of Furniture: ");
        String type = sc.nextLine();

        System.out.print("Enter the material of Furniture: ");
        String material = sc.nextLine();

        System.out.print("Enter the price of Furniture: ");
        int price = sc.nextInt();

        System.out.println();

        Furniture furniture = new Furniture(type, material, price);

        furniture.printDetails();
    }
}
