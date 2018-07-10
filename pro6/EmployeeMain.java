package pro6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

import java.util.Scanner;
public class EmployeeMain {
    public static void main(String args[]){

        Date date = new Date();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");

        Employee e[]=new Employee[5];
        for(int i=0; i<5; i++)
            e[i]=new Employee();

        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        for(int i=0;i<5; i++){
            System.out.println("enter the details of employee "+(i+1));
            System.out.print("name:");
            String name=sc.nextLine();
            e[i].setName(name);
            boolean temp1=false;
            int num;
            OuterLoop: do{
                System.out.print("num:");
                num = sc.nextInt();
                for (int j = 0; j <=i; j++) {
                    if (ar[j] == num) {
                        System.out.println("num must be unique");
                        continue OuterLoop;
                    }
                    ar[j]=num;
                }
                temp1=true;
            }while(!temp1);
            e[i].setNum(num);
            int temp=1;
            do{
                System.out.println("enter the date in format yyyy/MM/dd");
                String d=sc.next();
                try{
                    date = dateformat.parse(d);
                    temp=0;
                }
                catch(ParseException z){
                    System.out.println("Date is invalid");
                    z.getMessage();

                }
            }while(temp!=0);

            e[i].setDate(date);
            sc.nextLine();
        }
        for(int i=0; i<5; i++){
            System.out.println("\nDatails of employee "+(i+1));
            System.out.println("Employee name : "+e[i].getName());
            System.out.println("Employee num : "+e[i].getNum());
            date =e[i].getDate();
            String DateToStr= DateFormat.getDateInstance().format(date);
            System.out.println("date is "+DateToStr);
            //System.out.println("Date : "+e[i].getDate());

        }
    }
}

    //String DateToStr = DateFormat.getInstance().format(curDate);
