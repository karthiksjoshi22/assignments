package con;
import java.util.Scanner;
public class basecontacts {
    public String emp_name,emp_number;
    public int limit,count;
    public String[] list;
    basecontacts(){
        limit=5;
        count=0;
        list=new String[limit];
    }
    basecontacts(int a){
        limit=a;
        count=0;
        list=new String[limit];
    }
    Scanner input=new Scanner(System.in);
    public void add_contacts()
    {
        if(count<limit)
        {
            System.out.println("enter employee name");
            emp_name=input.nextLine();
            System.out.println("enter employee number");
            emp_number=input.nextLine();
            list[count]=emp_name+""+emp_number;
            count++;
        }
        else
            System.out.println("reached the limit");
    }
    public void show_contacts()
    {
        int x;
        for(x=0;x<count;x++)
        {
            System.out.println("the details are");
            String[] a=list[x].split("");
            System.out.println("name is\t"+a[0]+"\t"+"number is\t"+a[1]);
        }
    }

}

