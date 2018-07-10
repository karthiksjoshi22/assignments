package pro3;

import java.util.Scanner;
public class BookMain {

    public void createbooks(Book z, float x, String y) {
            z.setPrice(x);
            z.setTitle(y);
    }

    public void showbooks(Book z){
            System.out.println("Book Title :" + z.getTitle());
            System.out.println("Book price :" + z.getPrice());
    }

    public static void main(String args[]) {
        BookMain m = new BookMain();

        System.out.println("enter how many books want to create");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Book b[] = new Book[n];
        for (int i = 0; i < n; i++) {
            b[i] = new Book();
            System.out.println("enter the info about book" + (i + 1));

            System.out.println("enter the price");
            float x = sc.nextFloat();
            sc.nextLine();
            System.out.println("enter the title");
            String y = sc.nextLine();
            m.createbooks(b[i],x,y);
        }
        for (int i=0; i<n; i++) {
            System.out.println("\nInfo about book" + (i + 1));
            m.showbooks(b[i]);
        }
    }

}