package application;

import entities.ReservationNotBad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramNotBad {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room`s number: ");
        int number = sc.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy)");
        Date checkIn = sdf.parse(sc.next());
        System.out.println("Check-out date (dd/MM/yyyy)");
        Date checkOut = sdf.parse(sc.next());


        if (!checkOut.after(checkIn)) {
            System.out.println("ERROR in reservation: Check-out date must be higher than check-in date.");
        } else {
            ReservationNotBad reservationNotBad = new ReservationNotBad(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservationNotBad);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy)");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy)");
            checkOut = sdf.parse(sc.next());

            String error = reservationNotBad.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + reservationNotBad);
                reservationNotBad.updateDates(checkIn, checkOut);
            }
        }
        sc.close();
    }
}

