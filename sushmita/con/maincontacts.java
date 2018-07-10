package con;
import java.util.Scanner;
public class maincontacts {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter number contacts to be added");
        int n=input.nextInt();
        Derived d=new Derived(n);
        int m;
        do{
            System.out.println("enter your choice\n 1.add contacts\n 2.list contacts\n 3. search contacts\n 4.exit");
            m=input.nextInt();
            switch(m){
                case 1:d.add_contacts();
                        break;
                case 2:d.show_contacts();
                        break;
                case 3:System.out.println("enter the name to be searched");
                        input.nextLine();
                        String a=input.nextLine();
                        d.search(a);
                        break;
                default:java.lang.System.exit(0);
            }

        }while(m==1||m==2||m==3);
    }
}
