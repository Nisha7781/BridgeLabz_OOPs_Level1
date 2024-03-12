import java.util.*;


class Dog
{
    String breed;
    double age;
    double weight;

    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    double calculateHumanAge() {
        if (age == 1)
        {
        return age * 15;
        }
        else if (age == 2) {
            return (1 * 15) + (1 * 9);
        }
        else
        {
            return (1 * 15) + (1 * 9) + ((age - 2) * 4);
        }
    }


    void printDetails() {
        System.out.println("Dog's Details");
        System.out.println();
        System.out.println("Dog's Breed: " + breed);
        System.out.println("Dog's Age (in dog years): " + age);
        System.out.println("Dog's Age (in human years): " + calculateHumanAge());
        System.out.println("Dog's Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the breed of dog: ");
        String breed = sc.nextLine();

        System.out.print("Enter the age of dog (in years): ");
        int age = sc.nextInt();

        System.out.print("Enter the weight of dog(in kg): ");
        double weight = sc.nextDouble();

        System.out.println();

        Dog D = new Dog(breed, age, weight);

        D.printDetails();
    }
}
