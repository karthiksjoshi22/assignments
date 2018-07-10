package pro2;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        Rectangle obj[]=new Rectangle[5];
        for(int i=0; i<5; i++){
            System.out.println("enter info about obj"+(i+1));
            System.out.println("enter the length");
            float len=sc.nextFloat();
            System.out.println("enter the bredth");
            float bre=sc.nextFloat();

            obj[i]=new Rectangle(len,bre);
            obj[i].setLen(len);
            obj[i].setBre(bre);
        }

        for(int i=0;i<5;i++){
            System.out.println("Info about obj"+(i+1));
            System.out.println("length is "+obj[i].getLen());
            System.out.println("breadth is "+obj[i].getBre());
            System.out.println("area is "+obj[i].area());
        }

    }
}
