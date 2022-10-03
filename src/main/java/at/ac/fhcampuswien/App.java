package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here

        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here

        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        //input your solution here

        char ch = 'Z';
        int formerCh = ch;

        int hex = 0xface;

        int oct = 012;

        long l = 80L;
        int formerL = (int) l;

        float f = 44e-1f;
        int formerF = (int) f;

        float f2 = 5.5f;
        int formerF2 = (int) f2;

        double d = 8.88e1;
        int formerD = (int) d;

        double d2 = 99.9;
        int formerD2 = (int) d2;

        int sum = formerCh + hex + oct + formerL + formerF + formerF2 + formerD + formerD2;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        System.out.println("After Swap:");
        System.out.println("x: " + y);
        System.out.println("y: " + x);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);

        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("n1 > n2");
        }
        if (n2 > n1) {
            System.out.println("n2 > n1");
        }
        if (n1 == n2) {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int annualRevenue = scanner.nextInt();

        if (annualRevenue < 0 || annualRevenue >= 100000) {
            System.out.println("Invalid Revenue");
        }
        if (0 <= annualRevenue && annualRevenue < 20000) {
            System.out.println("Poor Sales Revenue");
        }
        if (20000 <= annualRevenue && annualRevenue < 50000) {
            System.out.println("Average Sales Revenue");
        }
        if (50000 <= annualRevenue && annualRevenue < 80000) {
            System.out.println("Good Sales Revenue");
        }
        if (80000 <= annualRevenue && annualRevenue < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int commissionClass = scanner.nextInt();

        switch (commissionClass) {
            case 1:
                System.out.println("Your Commission Rate was set to " + 0.01);
                break;
            case 2:
                System.out.println("Your Commission Rate was set to " + 0.02);
                break;
            case 3:
                System.out.println("Your Commission Rate was set to " + 0.03);
                break;
            case 4:
                System.out.println("Your Commission Rate was set to " + 0.04);
                break;
            default:
                System.out.println("Your Commission Rate was set to " + 0.00);
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);

        System.out.print("Year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year % 100 == 0) {
            System.out.println("Leapyear");
        }
        else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers() {
        // input your solution here

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        int thirdDigit = number % 10;
        int secondDigit = (number / 10) % 10;
        int firstDigit = number / 100;

        System.out.println(thirdDigit + "" + secondDigit + "" + firstDigit);
    }

    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}