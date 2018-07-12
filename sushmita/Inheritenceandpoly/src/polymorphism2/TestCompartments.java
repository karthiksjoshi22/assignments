package polymorphism2;
import java.util.*;
public class TestCompartments
{
    public static void main(String[] args)
    {


        Compartment co[]=new Compartment[10];

            for(int i=0;i<10;i++) {
                double x=Math.random()*5;

                int answer = (int)x;
                System.out.println(answer);
                switch (answer) {
                    case 1:
                        co[0] = new Firstclass();
                        co[0].notice();
                        break;
                    case 2:
                        co[1] = new Ladies();
                        co[1].notice();
                        break;
                    case 3:
                        co[2] = new General();
                        co[2].notice();
                        break;
                    case 4:
                        co[3] = new Luggage();
                        co[3].notice();
                        break;
                    default:
                        System.out.println("invalid choice");
                }
            }
    }
}
