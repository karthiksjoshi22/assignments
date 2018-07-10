package rect4;
import java.lang.String;
import java.util.Scanner;
public class Mainrectangle4
{
    public static void main(String args[])
    {
        Rectangle4 rect[]=new Rectangle4[5];
        for(int i=0;i<rect.length;i++)
        {
            rect[i]=new Rectangle4();
            double length=0,width=0;
            int x,y;
            System.out.println("\n Enter the length and breadth of rectangle :"+(i+1));
            do {
                Scanner b = new Scanner(System.in);
                System.out.println("enter length between the range 1 and 20");

            while(!b.hasNextDouble()||b.hasNextInt())
            {
                System.out.println("Invalid Input. only double values.");
                b.nextLine();
            }
            length = b.nextDouble();
            x=rect[i].setLength(length);
            }while(x==0);
            do
            {
                Scanner b1=new Scanner(System.in);
                System.out.println("enter width between the range 1 and 20");
                while(!b1.hasNextDouble()||b1.hasNextInt())
                {
                    System.out.println("Invalid Input. only double values.");
                    b1.nextLine();
                }
                width = b1.nextDouble();
                y=rect[i].setWidth(width);

            }while(y==0);
                     System.out.println("\n RECTANGLE ["+i+"] : "+rect[i].display());
        }
    }

}
