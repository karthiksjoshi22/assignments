package pro4;
import java.util.Scanner;
public class Operation {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        char operator;
        Double number1=0.0, number2=0.0, result;
        int temp=0;
        do {
            System.out.print("\nEnter number1 :  ");
            if (sc.hasNextDouble()) {
                number1 = sc.nextDouble();
                temp = 1;
            }
            else
                System.out.println("invalid number");
            sc.nextLine();
        }while(temp==0);
        do {
            System.out.print("\nEnter number2 : ");
            if (sc.hasNextDouble()) {
                number2 = sc.nextDouble();
                temp = 0;

            }
            else
                System.out.println("invalid number");
            sc.nextLine();
        }while(temp==1);
        /*System.out.println("enter the equation you have to operate in the format num1$num2$operator");
        String string = sc.nextLine();
        String[] arr = string.split("$");*/
        do {
            System.out.print("\nEnter operator (either +, -, * or /): ");
            operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.print(number1 + "+" + number2 + " = " + result);
                    temp=1;
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.print(number1 + "-" + number2 + " = " + result);
                    temp=1;
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.print(number1 + "*" + number2 + " = " + result);
                    temp=1;
                    break;
                case '/':
                    result = number1 / number2;
                    System.out.print(number1 + "/" + number2 + " = " + result);
                    temp=1;
                    break;
                default:
                    System.out.println("Invalid operator!");
            }
        }while(temp==0);
    }
}