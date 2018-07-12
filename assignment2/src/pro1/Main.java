package pro1;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Instrument obj[] = new Instrument[10];
        int choice=0, count=0;
        Scanner sc=new Scanner(System.in);

       do {
            System.out.println("\n"+(10 - count) + " Instruments can be created\nwhich object you want to create\n1:Piano 2:Flute 3: Guitar \nenter your choice ");
            if(sc.hasNextInt())
                choice = sc.nextInt();
            else {
                choice = 5;
                sc.nextLine();
            }

            switch(choice) {
                case 1: obj[count]=new Piano();
                        System.out.println("Piano object is created");
                        count++;
                        break;
                case 2: obj[count]=new Flute();
                         System.out.println("Flute object is created");
                         count++;
                         break;
                case 3:obj[count]=new Guitar();
                        System.out.println("Guitar object is created");
                        count++;
                        break;
                default:System.out.println("invalid choice");
                //sc.nextLine();
            }
        }while (count<10);

        for(int i=0; i<10; i++){
            if(obj[i] instanceof Piano) {
                System.out.println("Object " + (i + 1) + " is instanceOf Piano and is at index " + i);
                obj[i].play();
            }
            else if(obj[i] instanceof Flute){
                System.out.println("Object "+(i+1)+" isInstanceOf Flute and is at index "+i);
                obj[i].play();
            }
            else{
                System.out.println("Object "+(i+1)+" isInstanceOf Guitar and is at index "+i);
                obj[i].play();
            }
            System.out.println();
        }
    }
}
