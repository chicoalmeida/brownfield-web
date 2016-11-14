package com.brownfield.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingRecord {

    private long id;

    private String flightNumber;
    private String origin;
    private String destination;
    private String flightDate;
    private Date bookingDate;
    private String fare;
    private String status;

    private Set<Passenger> passengers;

    private BookingRecord(String flightNumber, String from, String to,
                          String flightDate, Date bookingDate, String fare) {
        this.flightNumber = flightNumber;
        this.origin = from;
        this.destination = to;
        this.flightDate = flightDate;
        this.bookingDate = bookingDate;
        this.fare = fare;
    }

    public static BookingRecord createBookingRecord(String flightNumber, String from, String to,
                                                    String flightDate, Date bookingDate, String fare) {
        return new BookingRecord(flightNumber, from, to, flightDate, bookingDate, fare);
    }
}