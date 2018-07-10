package Book;

import java.util.Scanner;
public class Book
{
    public String bktitle;
    public float bkprice;
    Scanner input=new Scanner(System.in);
    public void setbkprice()
    {
        System.out.println("enter the book price");
        float p=input.nextFloat();
        bkprice=p;
    }
    public float getbkprice()
    {
        return bkprice;
    }
    public void setbktitle()
    {
        System.out.println("enter the book title");
        String t=input.nextLine();
        bktitle=t;
    }
    public String getbktitle()
    {
        return bktitle;
    }
}

