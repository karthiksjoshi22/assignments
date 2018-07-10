package ass6;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Emp
{
    public int empNumber;
    public String empName;
    public Date joiningDate;

    public void setEmpname(String empName)
    {
        this.empName = empName;
    }
    public void setEmpnumber(int empNumber)
    {
        this.empNumber = empNumber;
    }
    public void setJoiningDate(Date joiningDate)
    {
        this.joiningDate = joiningDate;
    }
    public String getEmpname()
    {
       return empName;
    }
    public int  getEmpnumber()
    {
        return empNumber;
    }
    public Date getjoiningDate()
    {
      return joiningDate;
    }

    public void date()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the joining date :: ");
        String ind = input.next();
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date d = null;
        try
        {
            d=df.parse(ind);
            joiningDate=d;
        }
        catch(ParseException e)
        {
            System.out.println("Unable to parse " + ind);
        }

    }
    public void display()
    {
        System.out.println("Employee number = " + empNumber);
        System.out.println("Employee name = " + empName);
        System.out.println("Employee joining date = " + joiningDate);
    }
}


