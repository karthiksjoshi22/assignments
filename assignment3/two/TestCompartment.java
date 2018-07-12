package two;
import java.util.Random;
public class TestCompartment {
    public static void main(String[] args){
        Compartment[] compartment= new Compartment[10];
        Random random=new Random();
        int num=0;
        for(int i=0;i<compartment.length;i++){
            num=random.nextInt(4);
            if(num==0){
                compartment[i]=new FirstClass();
            }
            else if(num==1){
                compartment[i]=new Ladies();
            }
            else if(num==2){
                compartment[i]=new General();
            }
            else{
                compartment[i]=new Luggage();
            }

            compartment[i].notice();

            System.out.println();
        }
    }
}
