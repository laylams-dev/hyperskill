import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double bubblegum = 202;
        double toffee = 118;
        double iceCream = 2250;
        double milkChocolate = 1680;
        double doughnut = 1075;
        double pancake = 80;
        double income = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;

        System.out.println("Earned amount");
        System.out.println("Bubblegum: $" + bubblegum);
        System.out.println("Toffee: $" + toffee);
        System.out.println("Ice cream: $" + iceCream);
        System.out.println("Milk chocolate: $" + milkChocolate);
        System.out.println("Doughnut: $" + doughnut);
        System.out.println("Pancake: $" + pancake);
        System.out.println();
        System.out.printf("Income: $%.0f%n%n", income);


        /* Part 3 */
        System.out.println("Staff expenses: ");
        Scanner sc = new Scanner(System.in);
        double staffExpenses = sc.nextDouble();

        System.out.println("Other expenses: ");
        double otherExpenses = sc.nextDouble();
        sc.close();
        double netIncome = income - staffExpenses - otherExpenses;

        System.out.printf("Net income: $%.0f%n", netIncome);
    }
}