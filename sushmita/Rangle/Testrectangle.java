package Rangle;
import java.util.Scanner;
public class Testrectangle {
    public static void main(String args[])
    {
        Rectangle Rect[]=new Rectangle[5];
        for(int i=0;i<Rect.length;i++)
        {
            Rect[i]=new Rectangle();
            System.out.println("\n Enter the length and breadth of rectangle["+i+"] : ");
            Scanner b=new Scanner(System.in);
            double s=b.nextDouble();
            while(s<=0||s>20)
            {
               System.out.println("length cannot be negative zero or greater than 20");
               s=b.nextDouble();
            }
            Rect[i].setlength(s);
            Scanner b1=new Scanner(System.in);
            double s1=b1.nextDouble();
            while(s1<=0||s1>20)
            {
                System.out.println("length cannot be negative zero or greater than 20");
                s1=b.nextDouble();
            }
            Rect[i].setbreadth(s1);
            System.out.println("\n RECTANGLE ["+i+"] : "+Rect[i].display());
        }
    }
}
