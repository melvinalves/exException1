package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;

public class App {
    public static void main(String[] args) throws ParseException {
        
        Scanner sc= new Scanner(System.in);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room Number: ");
        int number= sc.nextInt();
        System.out.println("Checkin: ");
        Date checkin= sdf.parse(sc.next());
        System.out.println("Checkout: ");
        Date checkout= sdf.parse(sc.next());

        if (!checkout.after(checkin)){
            System.out.println("Error: o checkout tem de ser depois do checkin!");
        }
        else{
            Reservation reservation= new Reservation(number,checkin,checkout);
            System.out.println("Reservation: "+reservation);
        }









        sc.close();
    }
}
