package pro4;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String args[]){

        System.out.println("enter 5 rectangle info ");
        Scanner sc = new Scanner(System.in);
        Rectangle obj[]=new Rectangle[5];

        for(int i=0; i<5; i++){
            int y=0,z=0;
            double length, width;
            obj[i]=new Rectangle();
            System.out.println("\nInfo about rectabgle "+(i+1));

            do {
                System.out.println("\nEnter the length range between 0-20");
                while (!sc.hasNextDouble() || sc.hasNextInt()) {
                    System.out.println("Error..Number must be a float type");
                    sc.next();
                }
                length = sc.nextDouble();
                y = obj[i].setLength(length);

            }while(y==0);

            do{
                System.out.println("\nEnter the width range between 0-20");
                while(!sc.hasNextDouble() || sc.hasNextInt()) {
                    System.out.println("Error..Number must be a float type");
                    sc.next();
                }
                width=sc.nextDouble();
                    z = obj[i].setWidth(width);
            }while(z==0);
        }

        for(int i=0;i<5;i++){
            System.out.println("\nInfo about rectangle"+(i+1));
            System.out.println("length is "+obj[i].getLength());
            System.out.println("width is "+obj[i].getWidth());
            System.out.println("area is "+obj[i].area());
            System.out.println("perimeter is "+obj[i].perimeter());
        }

    }

}