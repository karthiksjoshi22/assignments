package polymorphism4;
import java.util.Scanner;
public class Number {
    public static void main(String args[]) {
        double a, b, res;
        char ch;
        Scanner input = new Scanner(System.in);
        do {
        System.out.println("\nthe possible operations are");
        System.out.println("choose one operation:");
        System.out.println("1.Addition(+)");
        System.out.println("2.Subtraction(-)");
        System.out.println("3.Multiplication(*)");
        System.out.println("4.Division(/)");
        System.out.println("5.exit");
        ch = input.next().charAt(0);

            switch (ch) {
                case '+':
                    System.out.print("Enter Two Number you want to add : \n");
                    a = input.nextDouble();
                    b = input.nextDouble();
                    res = a + b;
                    System.out.print("the sum is = " + res);
                    break;
                case '-':
                    System.out.print("Enter Two Number you want to subtract : \n");
                    a = input.nextDouble();
                    b = input.nextDouble();
                    res = a - b;
                    System.out.print("the difference is = " + res);
                    break;
                case '*':
                    System.out.print("Enter Two Number you want to multiply : \n");
                    a = input.nextDouble();
                    b = input.nextDouble();
                    res = a * b;
                    System.out.print("the product is = " + res);
                    break;
                case '/':
                    System.out.print("Enter Two Number you want to divide : \n");
                    a = input.nextDouble();
                    b = input.nextDouble();
                    res = a / b;
                    System.out.print("the result is = " + res);
                    break;
                case '5':
                    System.exit(0);
                    break;
                default:
                    System.out.print("Wrong Choice!!!");
                    break;
            }
        } while (ch != 5);

    }
}
