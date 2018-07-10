package Book;

import java.util.Scanner;
public class Mainbook {
    Scanner input=new Scanner(System.in);
    public void createbk(Book[] b, int n) {
        for (int i = 0; i < n; i++) {
            b[i].setbktitle();
            b[i].setbkprice();
        }
    }

    public void showbk(Book[] b, int n) {
        System.out.println("the books created are:");
        System.out.println("booktitle\tbookprice");
        for (int i = 0; i < n; i++) {
            //System.out.println("booktitle\tbookprice");
            System.out.println(b[i].getbktitle()+"\t\t\t"+b[i].getbkprice());
            //System.out.print("\t"+b[i].getbkprice());
        }
    }

    public static void main(String args[]) {
        Mainbook A = new Mainbook();
        System.out.println("enter the books to be added");
        int n = A.input.nextInt();
        Book[] b = new Book[n];
        for (int i = 0; i < n; i++){
            b[i]=new Book();
        }


        A.createbk(b, n);
        A.showbk(b, n);
    }

}




