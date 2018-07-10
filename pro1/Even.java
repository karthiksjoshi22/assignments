package pro1;

import java.util.Scanner;
public class Even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        System.out.println("even num from 0 t0 "+n+" is");
        for(int i=0;i<=n;i++)
        {
            if(i%2 ==0)
                System.out.println(i);
        }
        System.out.println("even progrm");
    }
}
