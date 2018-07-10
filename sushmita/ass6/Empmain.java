package ass6;

import ass6.Emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Empmain {
    public static void main(String args[])
    {
        Emp e[] = new Emp[5];

        for (int i = 0; i < 5; i++) {
            e[i] = new Emp();
            Scanner input = new Scanner(System.in);
            System.out.println("enter the employee name");
            String empName=input.nextLine();
            e[i].setEmpname(empName);
            System.out.println("enter the employee number");
            int empNumber=input.nextInt();
            e[i].setEmpnumber(empNumber);
            Scanner a=new Scanner(System.in);
            System.out.println("Enter the joining date :: ");
            String ind = a.next();
            SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            Date d = null;
            try
            {
                d=df.parse(ind);
            }
            catch(ParseException x)
            {
                System.out.println("Unable to parse " + ind);
            }
            e[i].setJoiningDate(d);
        }

        System.out.println("the details are");

        for (int i = 0; i < 5; i++)
        {
            e[i].display();
        }
    }
}
