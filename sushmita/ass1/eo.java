package ass1;

import java.util.Scanner;
public class eo {
    public static void main(String args[])
        {
            int x,i;
            Scanner input=new Scanner(System.in);
            System.out.println("enter a number");
            x=input.nextInt();
            System.out.println("the even numbers before the entered number are");
            for(i=1;i<=x;i++)
            {
                if(i%2==0)
                {
                    System.out.println(i+"");
                }
            }
        }
    }

