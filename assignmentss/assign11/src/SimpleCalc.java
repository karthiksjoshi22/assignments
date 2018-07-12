import java.util.Scanner;
public class SimpleCalc {
    public static void main(String args[])
    {
        double result=0;

        System.out.println("enter the first number");
        Scanner in=new Scanner(System.in);
        while (!in.hasNextDouble())
        {
            System.out.println("Invalid input\n Type the double-type number:");
            in.next();
        }
        double a=in.nextDouble();


        System.out.println("enter the second number");
        while (!in.hasNextDouble())
        {
            System.out.println("Invalid input\n Type the double-type number:");
            in.next();
        }

        double b=in.nextDouble();
        boolean temp=false;
        char c;

        System.out.println("enter operator +,-,* or /");
       do {
            c=in.next().charAt(0);
           if(c=='*' || c=='+' || c=='-' || c=='/')
           {
               temp=true;
               break;

           }
           else

           {
               System.out.println("Invalid operator/n Enter valid operator");
               continue;

           }

       }while(!temp);



       /* while ((in.next().charAt(0) != '+') ||  (in.next().charAt(0) != '-') ||  (in.next().charAt(0) != '*')  ||  (in.next().charAt(0) !='/'))
        {
            if((in.next().charAt(0) != '+') ||  (in.next().charAt(0) != '-') ||  (in.next().charAt(0) != '*')  ||  (in.next().charAt(0) !='/')) {
                System.out.println("Invalid input\n Type the double-type number:");
                in.next();
                continue;
            }
            else
            {
                break;
            }
        }*/
        //char c=in.next().charAt(0);

        switch (c)
        {
            case '+':result=a+b;
            break;
            case '-':result=a-b;
            break;
            case '*':result=a*b;
            break;
            case '/':result=a/b;
                try{
                    result=a/b;
                }catch(ArithmeticException e){System.out.println(e);}
                break;
            default:System.out.println("invalid operator");

        }
        System.out.println(a+""+c+""+b+"="+result);

    }
}
