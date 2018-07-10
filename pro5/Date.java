package pro5;

import java.util.Scanner;
public class Date {
    private int dd, mm, yyyy;

    Date(){
        dd=0;
        mm=0;
        yyyy=0;
    }
    Scanner sc=new Scanner(System.in);

    Date(int dd, int mm, int yyyy){
        this.dd=dd;
        this.mm=mm;
        this.yyyy=yyyy;

        if (mm == 1 || mm == 3 || mm == 5 || mm ==  7 || mm ==  8 || mm ==  10 || mm == 12)
        {
            if (dd > 31 || dd < 1)
                System.out.println("invalid day");
        }
        else if (mm == 4 || mm == 6 || mm == 9 || mm == 11)
        {
            if (dd > 30 || dd < 1)
                System.out.println("invalid day");
        }
        else if (mm == 2)
        {
            if (yyyy % 4 == 0)
            {
                if (dd > 29 || dd<1)
                    System.out.println("invalid day");
            }
            else
                {
                    if (dd > 28 || dd < 1)
                            System.out.println("invalid day");
                }
        }
        else
            System.out.println("invalid month");

    }

    public void alter(){
        System.out.println("current date is "+dd+"/"+mm+"/"+yyyy);
        System.out.println("enter a integer");
        int z=sc.nextInt();

        if (mm == 1 || mm == 3 || mm == 5 || mm ==  7 || mm ==  8 || mm ==  10)
        {
            dd+=z;
            if(dd > 31){
                dd-=31;
                mm++;
            }
        }
        else if (mm == 4 || mm == 6 || mm == 9 || mm == 11)
        {
            dd+=z;
            if(dd > 30){
                dd-=30;
                mm++;
            }
        }
        else if (mm == 2)
        {
            if (yyyy % 4 == 0)
            {
                dd+=z;
                if(dd > 29){
                    dd-=29;
                    mm++;
                }
            }
            else
            {
                dd+=z;
                if(dd > 28){
                    dd-=28;
                    mm++;
                }
            }
        }
        else
        {
            dd+=z;
            if(dd > 31){
                dd-=31;
                mm=1;
                yyyy++;
            }
        }
        System.out.println("new date is "+dd+"/"+mm+"/"+yyyy);
    }

}


