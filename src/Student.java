import java.util.*;

class Student
{
    String name;
    int age;
    int ID;

    void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        System.out.print("Enter student name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter student age: ");
        s1.age = sc.nextInt();

        s1.printInfo();
    }
}
