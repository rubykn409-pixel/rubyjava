import java.util.Scanner;

class MethodOverloading
{
    // Method to add two integers
    int add(int a, int b)
    {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c)
    {
        return a + b + c;
    }

    // Method to add two decimal numbers
    double add(double a, double b)
    {
        return a + b;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        MethodOverloading obj = new MethodOverloading();

        // Getting two numbers from user
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.println("Sum of two numbers = " + obj.add(n1, n2));

        // Getting three numbers from user
        System.out.print("\nEnter third number: ");
        int n3 = sc.nextInt();

        System.out.println("Sum of three numbers = " + obj.add(n1, n2, n3));

        // Getting decimal numbers from user
        System.out.print("\nEnter first decimal number: ");
        double d1 = sc.nextDouble();

        System.out.print("Enter second decimal number: ");
        double d2 = sc.nextDouble();

        System.out.println("Sum of two decimal numbers = " + obj.add(d1, d2));

        sc.close();
    }
}