package pro2;
import java.util.Random;
public class TestCompartment {
    public static void main(String args[]) {
        Random rand = new Random();
        int n;

        Compartment[] compartments = new Compartment[10];
        for (int i = 0; i < 10; i++) {
            n = rand.nextInt(4 + 1);
            switch (n) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }

        for (int i = 0; i < 10; i++) {
            if (compartments[i] instanceof FirstClass) {
                System.out.println("Object " + (i + 1) + " is instanceOf FirstClass and is at index " + i);
                compartments[i].notice();
            } else if (compartments[i] instanceof Ladies) {
                System.out.println("Object " + (i + 1) + " is InstanceOf Ladies and is at index " + i);
                compartments[i].notice();
            } else if (compartments[i] instanceof General) {
                System.out.println("Object " + (i + 1) + " is InstanceOf General and is at index " + i);
                compartments[i].notice();
            } else {
                System.out.println("Object " + (i + 1) + " is InstanceOf Luggage and is at index " + i);
                compartments[i].notice();
            }
            System.out.println();
        }
    }
}




