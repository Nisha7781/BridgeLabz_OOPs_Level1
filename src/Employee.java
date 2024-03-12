import  java.util.*;
class Employee
{
    String name;
    int salary;
    int ID;

    int calculateYearlySalary()
    {
        salary = salary * 12;
        return  salary;
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Yearly Salary is: " + calculateYearlySalary());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter employee name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter employee monthly salary: ");
        emp.salary = sc.nextInt();

        emp.printInfo();
    }
}

