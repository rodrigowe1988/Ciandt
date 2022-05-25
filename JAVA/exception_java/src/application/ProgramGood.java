package application;

import entities.ReservationGood;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramGood {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room`s number: ");
            int number = sc.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy)");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy)");
            Date checkOut = sdf.parse(sc.next());

            ReservationGood reservationGood = new ReservationGood(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservationGood);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy)");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy)");
            checkOut = sdf.parse(sc.next());

            reservationGood.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservationGood);
        }
        catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        sc.close();
    }
}


