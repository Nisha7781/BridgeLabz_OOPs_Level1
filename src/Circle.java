import  java.util.*;
public class Circle
{
    float radius;
    double area;
    double circumference;


    public void Calculate_Area()
    {
        area = 3.14 * (radius * radius);
        System.out.println("Area of circle is: " + area);
    }
    public void Calculate_Circumference()
    {
         circumference = 2 * 3.14 * radius;
        System.out.println("circumference of circle is: " + circumference);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        System.out.print("Enter radius: ");
        c.radius = sc.nextFloat();

        c.Calculate_Area();
        c.Calculate_Circumference();
    }
}
