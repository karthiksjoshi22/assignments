package assignment2;

import java.util.Scanner;

public class SearchContact extends ContactDetails {
    SearchContact(int n){
        super(n);
    }
    public void search(String cn){
        for(int i=0;i<max;i++) {
            String[] arr = list[i].split(" ");
            String temp = arr[0];
            if (temp.equalsIgnoreCase(cn)) {
                System.out.println(arr[0] + " " + arr[1]);
                return;
            }
        }
        System.out.println("contact not in the list");
    }
}