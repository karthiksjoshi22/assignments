package three;
import java.util.Random;

public class TestMedicine {
    public static void main(String[] args){
        Medicine[] medicine= new Medicine[10];
        Random random=new Random();
        int num=0;
        for(int i=0;i<medicine.length;i++){
            num=random.nextInt(3);

            if(num==0){
                medicine[i]=new Tablet();
            }
            else if(num==1){
                medicine[i]=new Syrup();
            }
            else{
                medicine[i]=new Ointment();
            }

            medicine[i].displayLabel();

        }
    }
}
