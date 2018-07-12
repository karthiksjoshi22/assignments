package pro3;
import java.util.Random;
public class TestMedicine {
    public static void main(String args[]) {
        Random rand = new Random();
        int n;

        Medicine[] medicines=new Medicine[10];
        for (int i = 0; i < 10; i++) {
            n = rand.nextInt(3 + 1);
            if(n==1)
                medicines[i]=new Tablet();
            else if(n==2)
                medicines[i]=new Syrup();
            else
                medicines[i]=new Ointment();
        }

        for (int i = 0; i < 10; i++) {
            if(medicines[i] instanceof Tablet){
                System.out.println("Object " + (i + 1) + " is instanceOf Tablet and is at index " + i);
                medicines[i].displayLabel();
            }
            else if (medicines[i] instanceof Syrup) {
                System.out.println("Object " + (i + 1) + " is InstanceOf Syrup and is at index " + i);
                medicines[i].displayLabel();
            }
            else {
                System.out.println("Object " + (i + 1) + " is InstanceOf Ointment and is at index " + i);
                medicines[i].displayLabel();
            }
            System.out.println();
        }
    }
}




