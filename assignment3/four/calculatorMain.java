package four;
import java.util.Scanner;

public class calculatorMain {
    public static void main(String[] args){
        double firstNumber,secondNumber;
        char operator;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");

        while(!input.hasNextDouble()){
          System.out.println("nope! enter a number");
        }
        firstNumber=input.nextDouble();

        System.out.println("Enter the Operation that you want to perfom on these numbers");
        System.out.println("1. Add : + | 2. Subtract : - | 3. Multiply : * | 4. Divide : /");
        operator=input.next().charAt(0);

        while(!(operator=='+') && !(operator=='-') && !(operator=='*') && !(operator=='/')){
            System.out.println("invalid operation. enter from (+ , - , * , /)");
            operator=input.next().charAt(0);
        }

        System.out.println("Enter the second number");
        while(!input.hasNextDouble()){
            System.out.println("nope! enter a number");
        }
        secondNumber=input.nextDouble();

        switch(operator){
            case '+': System.out.println(firstNumber+"+"+secondNumber+"="+(firstNumber+secondNumber));
                      break;
            case '-': double result=firstNumber-secondNumber;
                      System.out.println(firstNumber+"-"+secondNumber+"="+result);
                      break;
            case '*': System.out.println(firstNumber+"*"+secondNumber+"="+firstNumber*secondNumber);
                      break;
            case '/': System.out.println(firstNumber+"/"+secondNumber+"="+firstNumber/secondNumber);
                      break;
        }


    }
}
