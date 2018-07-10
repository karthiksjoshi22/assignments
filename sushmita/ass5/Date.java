package ass5;
import java.util.Scanner;
public class Date {
    private int m, d, y;

    Date() {
        d = 0;
        m = 0;
        y = 0;
    }

    Scanner sc = new Scanner(System.in);

    Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
        //System.out.println("current date is"+ d + "/" + m + "/" + y);
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
        {
            if (d < 1 || d > 31)
            {
                System.out.println("invalid day");
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11)
        {
            if (d < 1 || d > 30)
            {
                System.out.println("invalid day");
            }
        } else if (m == 2)
        {
            if (y % 4 == 0)
            {
                if (d > 29 || d < 1)
                    System.out.println("invalid day");
            } else {
                if (d > 28 || d < 1)
                    System.out.println("invalid day");
            }
        } else
            System.out.println("invalid month");

    }

    public void alter()
    {
        //Scanner sc = new Scanner(System.in);
        System.out.println("current date is" + d + "/" + m + "/" + y);
        System.out.println("enter a number");
        int x = sc.nextInt();
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
        {
            d += x;
            if (d > 31)
            {
                d -= 31;
                m++;
            }
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11)
        {
            d += x;
            if (d > 30)
            {
                d -= 30;
                m++;
            }
        } else if (m == 2) {
            if (y % 4 == 0) {
                d += x;
                if (d > 29) {
                    d -= 29;
                    m++;
                } else {
                    d += x;
                    if (d > 28) {
                        d -= 28;
                        m++;
                    }
                }
            } else {
                d += x;
                if (d > 31) {
                    d -= 31;
                    m = m + 1;
                    y++;
                }
            }
        }
            System.out.println("the altered date is" + d + "/" + m + "/" + y);
    }

}




